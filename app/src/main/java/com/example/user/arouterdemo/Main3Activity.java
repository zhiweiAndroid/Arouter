package com.example.user.arouterdemo;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/demo/main3", group = "main")
public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView tv = findViewById(R.id.tv3);
        Button btn = findViewById(R.id.btn3);
        tv.setText(getIntent().getStringExtra("name"));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*MyFragment fragment = new MyFragment();*/
                Fragment fragment= (Fragment) ARouter.getInstance().build("/demo/myfragment").navigation();
                getSupportFragmentManager().beginTransaction().add(R.id.rl3, fragment).commit();
            }
        });

    }
}
