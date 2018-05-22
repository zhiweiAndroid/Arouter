package com.example.user.arouterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.user.arouterdemo.bean.Person;
import com.example.user.arouterdemo.service.IService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Autowired(name = "/say/hello1")
    IService iService1;

    @Autowired(name = "/say/hello2")
    IService iService2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                ARouter.getInstance().build("/demo/main3","main").withString("name","zitan").navigation(this, new NavigationCallback() {
                    @Override
                    public void onFound(Postcard postcard) {
                        Log.e("NavigationCallback", "onFound: 找到了 ");
                    }

                    @Override
                    public void onLost(Postcard postcard) {
                        Log.e("NavigationCallback", "onLost: 没找到了 ");
                    }

                    @Override
                    public void onArrival(Postcard postcard) {
                        String group = postcard.getGroup();
                        Log.e("navigation", "onArrival: "+group);
                    }

                    @Override
                    public void onInterrupt(Postcard postcard) {
                        Log.e("NavigationCallback", "onInterrupt: 被拦截了 ");
                    }
                });
                break;
            case R.id.btn2:
                //使用bundle
                Bundle bundle = getBundle();
                ARouter.getInstance().build("/demo/main2").with(bundle).navigation(this, new NavCallback() {
                    @Override
                    public void onArrival(Postcard postcard) {
                        String group = postcard.getGroup();
                        Log.e("navigation", "onArrival: "+group);
                    }
                });
                break;
            case R.id.btn3:
             ARouter.getInstance().build("/demo/web").navigation();
                break;
            case R.id.btn4:
                ARouter.getInstance().inject(this);
                iService1.sayhello(this);
                break;
            case R.id.btn5:
               ARouter.getInstance().inject(this);
               iService2.sayhello(this);
                break;

        }
    }

    private Bundle getBundle() {
        Person person=new Person();
        person.setName("zitan");
        person.setAge(27);
        person.setBoy(true);
        Bundle bundle=new Bundle();
        bundle.putSerializable("zitan",person);
        return bundle;
    }
}
