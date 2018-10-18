package com.mert.gsonproject.data;

import android.app.Activity;

import com.mert.gsonproject.data.db.gsons.GsonHelper;
import com.mert.gsonproject.data.model.Person;

public class DataManager {

    private Activity activity;

    //GSON
    public GsonHelper gsonHelper;

    public DataManager(Activity activity) {
        this.activity = activity;

        gsonHelper = new GsonHelper();
    }

    public Person getPerson() {
        String json = "{\n" +
                "  \"name\": \"John\",\n" +
                "  \"age\": 30,\n" +
                "  \"cars\": [\n" +
                "    {\n" +
                "      \"name\": \"Ford\",\n" +
                "      \"models\": [\n" +
                "        \"Fiesta\",\n" +
                "        \"Focus\",\n" +
                "        \"Mustang\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"BMW\",\n" +
                "      \"models\": [\n" +
                "        \"320\",\n" +
                "        \"X3\",\n" +
                "        \"X5\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Fiat\",\n" +
                "      \"models\": [\n" +
                "        \"500\",\n" +
                "        \"Panda\"\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        return gsonHelper.fromJson(json);
    }

    public String getJsonbyPerson(Person person) {
        return gsonHelper.toJson(person);
    }


}
