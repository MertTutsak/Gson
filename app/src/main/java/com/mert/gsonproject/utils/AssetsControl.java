package com.mert.gsonproject.utils;

import android.app.Activity;

import java.io.IOException;
import java.io.InputStream;

public class AssetsControl {

    private Activity activity;

    public AssetsControl(Activity activity) {
        this.activity = activity;
    }

    public String toStringFromAsset(String fileName) {
        String json = null;
        try {
            InputStream is = activity.getAssets().open(fileName);

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
