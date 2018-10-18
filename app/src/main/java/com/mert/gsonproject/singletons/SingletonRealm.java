package com.mert.gsonproject.singletons;

import android.app.Activity;
import android.util.Log;

import com.mert.gsonproject.data.db.realms.Realm;

public class SingletonRealm extends Realm {
    private static SingletonRealm ourInstance;

    private SingletonRealm(Activity activity) {
        super(activity);
    }

    public static SingletonRealm getInstance(Activity activity) {
        if (ourInstance == null) {
            ourInstance = new SingletonRealm(activity);
            Log.d(SingletonRealm.class.getClass().getSimpleName(), "SingletonRealm ayağa kaldırıldı.");
        }

        return ourInstance;
    }
}