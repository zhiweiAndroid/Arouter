package com.example.user.arouterdemo.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by zitan on 2018/5/22.
 */

public interface IService extends IProvider {
    void sayhello(Context context);
}
