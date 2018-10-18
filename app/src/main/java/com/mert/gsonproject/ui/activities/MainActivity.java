package com.mert.gsonproject.ui.activities;

import android.os.Bundle;

import com.mert.gsonproject.R;
import com.mert.gsonproject.data.db.sharedpreferences.SharedPreferences;
import com.mert.gsonproject.singletons.SingletonRealm;
import com.mert.gsonproject.ui.base.BaseActivity;
import com.mert.gsonproject.ui.login.LoginFragment;

public class MainActivity extends BaseActivity {

    //SharedPreferences
    private SharedPreferences sharedPreferences;

    //Singleton
    private SingletonRealm singletonRealm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = new SharedPreferences(this);

        if (!sharedPreferences.isLogin()) {
            initView(new LoginFragment());
        } else {
            singletonRealm = singletonRealm.getInstance(this);
            singletonRealm.getUser(sharedPreferences.getId());
            //initView(new ...());
        }

    }
}
