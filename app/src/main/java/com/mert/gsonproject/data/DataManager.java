package com.mert.gsonproject.data;

import android.app.Activity;
import android.util.Log;

import com.mert.gsonproject.data.db.gsons.GsonHelper;
import com.mert.gsonproject.data.model.Person;
import com.mert.gsonproject.utils.AssetsControl;

public class DataManager {

    private Activity activity;

    //GSON
    public GsonHelper gsonHelper;

    public DataManager(Activity activity) {
        this.activity = activity;

        this.gsonHelper = new GsonHelper(activity);
    }

    public Person getPersonbyString() {
        AssetsControl assetsControl = new AssetsControl(activity);
        String jsonString = assetsControl.toStringFromAsset("json_file.json");
        Log.d(this.getClass().getSimpleName(), "Json Text :" + jsonString);
        return gsonHelper.fromJsonString(jsonString);
    }
}
