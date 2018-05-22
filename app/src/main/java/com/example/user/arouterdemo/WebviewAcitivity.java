package com.example.user.arouterdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by zitan on 2018/5/22.
 */
@Route(path = "/demo/web")
public class WebviewAcitivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
       WebView web= findViewById(R.id.web);
       web.loadUrl("file:///android_asset/arouter.html");

    }
}
