package com.example.user.arouterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.user.arouterdemo.bean.Person;

@Route(path = "/demo/main2")
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Person person= (Person) getIntent().getSerializableExtra("zitan");
        TextView tv = findViewById(R.id.tv2);
        tv.setText("name:"+person.getName()+">>>>>>>>>age:"+person.getAge()+">>>>>>>>boy:"+person.isBoy());


    }
}
