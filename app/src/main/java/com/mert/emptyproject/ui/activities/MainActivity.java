package com.mert.emptyproject.ui.activities;

import android.os.Bundle;

import com.mert.emptyproject.R;
import com.mert.emptyproject.data.db.sharedpreferences.SharedPreferences;
import com.mert.emptyproject.singletons.SingletonRealm;
import com.mert.emptyproject.ui.base.BaseActivity;
import com.mert.emptyproject.ui.login.LoginFragment;

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
