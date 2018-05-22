package com.example.user.arouterdemo.service;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by zitan on 2018/5/22.
 */
@Route(path = "/say/hello2",name = "test service2")
public class MyService2 implements IService {
    @Override
    public void sayhello(Context context) {
        Toast.makeText(context,"hello2",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {

    }
}
