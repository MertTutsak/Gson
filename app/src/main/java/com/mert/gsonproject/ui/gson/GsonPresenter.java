package com.mert.gsonproject.ui.gson;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.mert.gsonproject.data.model.Person;
import com.mert.gsonproject.ui.base.BaseActivity;

public class GsonPresenter implements Gson.Presenter {
    private Activity activity;

    //Person
    private Person person;

    //Fragment
    private Fragment fragment;

    public GsonPresenter(Activity activity, Fragment fragment) {
        this.activity = activity;
        this.fragment = fragment;
    }

    @Override
    public void Completed() {
        person = ((BaseActivity) activity).dataManager.getPersonbyString();

        if (person != null) {
            ((GsonFragment) fragment).initView(person);
        }
    }

}
