package com.mert.gsonproject.ui.activities;

import android.os.Bundle;

import com.mert.gsonproject.ui.base.BaseActivity;
import com.mert.gsonproject.ui.gson.GsonFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView(new GsonFragment());



    }
}
