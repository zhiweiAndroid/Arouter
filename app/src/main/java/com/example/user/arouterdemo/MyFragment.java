package com.example.user.arouterdemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by zitan on 2018/5/22.
 */
@Route(path = "/demo/myfragment")
public class MyFragment extends Fragment {

    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view==null){
             view=inflater.inflate(R.layout.fragment_my,container,false);
        }
        return view;
    }
}
