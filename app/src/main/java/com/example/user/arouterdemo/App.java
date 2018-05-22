package com.example.user.arouterdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;


/**
 * Created by zitan on 2018/5/22.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
