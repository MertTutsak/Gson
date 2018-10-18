package com.mert.gsonproject.data.db.gsons;

import android.app.Activity;
import android.graphics.ColorSpace;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.mert.gsonproject.data.model.Car;
import com.mert.gsonproject.data.model.Person;

import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class GsonHelper {

    private Activity activity;

    public Gson gson;
    private JsonParser parser;

    public GsonHelper(Activity activity) {
        this.activity = activity;

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        gson = builder.create();

        parser = new JsonParser();
    }

    public GsonHelper() {

    }

    public Person fromJsonString(String json) {
        //Kısa Yol. Ancak object olarak çekemezsin.
        Person person = gson.fromJson(json, Person.class);

        //Person person = new Person(getName(json), getAge(json), getCar(json));
        return person;
    }

    public Person fromJsonReader(Reader reader) {
        //Kısa Yol. Ancak object olarak çekemezsin.
        Person person = gson.fromJson(reader, Person.class);

        //Person person = new Person(getName(json), getAge(json), getCar(json));
        return person;
    }

    private String getName(String jsonString) {
        JsonElement rootNode = parser.parse(jsonString);

        if (rootNode.isJsonObject()) {

            JsonObject details = rootNode.getAsJsonObject();

            JsonElement nameNode = details.get("name");

            Log.d(this.getClass().getSimpleName(), "name :" + nameNode.toString());
            return nameNode.getAsString();
        }

        return null;
    }

    private int getAge(String jsonString) {
        JsonElement rootNode = parser.parse(jsonString);

        if (rootNode.isJsonObject()) {

            JsonObject details = rootNode.getAsJsonObject();

            JsonElement ageNode = details.get("age");

            Log.d(this.getClass().getSimpleName(), "age :" + ageNode.toString());
            return ageNode.getAsInt();
        }

        return -1;
    }

    private Car getCar(String jsonString) {
        JsonElement rootNode = parser.parse(jsonString);

        if (rootNode.isJsonObject() && !rootNode.isJsonNull()) {
            JsonObject details = rootNode.getAsJsonObject();

            //Car
            JsonElement carNode = details.get("car");

            if (!carNode.isJsonNull()) {

                JsonObject carNodeAsJsonObject = carNode.getAsJsonObject();

                //Car Name
                JsonElement nameNode = carNodeAsJsonObject.get("name");
                Log.d(this.getClass().getSimpleName(), "car :" + nameNode.toString());
                //Car Models
                JsonArray models = carNodeAsJsonObject.getAsJsonArray("models");
                ArrayList<String> modelArrayList = new ArrayList<>();
                if (models.size() > 0) {

                    for (int i = 0; i < models.size(); i++) {
                        JsonPrimitive value = models.get(i).getAsJsonPrimitive();
                        Log.d(this.getClass().getSimpleName(), "models :" + value.toString());
                        modelArrayList.add(value.getAsString());

                    }
                }

                return new Car(nameNode.getAsString(), modelArrayList);
            }
        }
        return null;
    }

    public String toJson(Person person) {
        String json = gson.toJson(person);
        return json;
    }
}
