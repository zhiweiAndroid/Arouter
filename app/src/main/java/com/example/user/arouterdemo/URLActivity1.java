package com.example.user.arouterdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by zitan on 2018/5/22.
 */
@Route(path = "/com/URLA1")
public class URLActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_url);
        TextView tv = findViewById(R.id.tv);
        tv.setText("普通跳转");
    }
}
