package com.mert.emptyproject.singletons;

import android.app.Activity;
import android.util.Log;

import com.mert.emptyproject.data.model.User;

public class SingletonUser{
    private static SingletonUser ourInstance;

    private User user;

    private Activity activity;

    private SingletonUser() {
        user = new User();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static SingletonUser getInstance() {
        if (ourInstance == null) {
            ourInstance = new SingletonUser();
            Log.d(SingletonRealm.class.getClass().getSimpleName(), "SingletonUser ayağa kaldırıldı.");
        }

        return ourInstance;
    }
}
