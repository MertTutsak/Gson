package com.mert.gsonproject.data;

import android.app.Activity;
import android.util.Log;

import com.mert.gsonproject.data.db.gsons.GsonHelper;
import com.mert.gsonproject.data.model.Person;

public class DataManager {

    private Activity activity;

    //GSON
    public GsonHelper gsonHelper;

    public DataManager(Activity activity) {
        this.activity = activity;

        this.gsonHelper = new GsonHelper(activity);
    }

    public Person getPerson() {
        String json = "{\n" +
                "  \"name\": \"John\",\n" +
                "  \"age\": 30,\n" +
                "  \"car\": {\n" +
                "    \"name\": \"Ford\",\n" +
                "    \"models\": [\n" +
                "      \"Fiesta\",\n" +
                "      \"Focus\",\n" +
                "      \"Mustang\"\n" +
                "    ]\n" +
                "  }\n" +
                "}";

        Log.d(this.getClass().getSimpleName(), "Json Text :" + json);
        return gsonHelper.fromJson(json);
    }


}
