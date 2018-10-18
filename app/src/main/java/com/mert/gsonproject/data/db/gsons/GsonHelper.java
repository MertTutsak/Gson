package com.mert.gsonproject.data.db.gsons;

import android.app.Activity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mert.gsonproject.data.model.Person;

import java.lang.reflect.Type;

public class GsonHelper {

    private Activity activity;

    public Gson gson;

    public GsonHelper(Activity activity) {
        this.activity = activity;

        GsonBuilder builder = new GsonBuilder();
        gson = builder.create();
    }

    public GsonHelper() {

    }

    public Person fromJson(String json) {
        /*Type type = new TypeToken<Person>() {}.getType();
        return gson.fromJson(json, type);*/

        return gson.fromJson(json, Person.class);
    }

    public String toJson(Person person) {
        String json = "";
        return gson.fromJson(json, person);
    }
}
