package com.mert.gsonproject.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Car {

    @SerializedName("name")
    private String name;

    @SerializedName("models")
    private ArrayList<String> models;

    public Car(String name, ArrayList<String> models) {
        this.name = name;
        this.models = models;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getModels() {
        return models;
    }

    public void setModels(ArrayList<String> models) {
        this.models = models;
    }

    public void addModel(String model) {
        this.addModel(model);
    }

    public void addModels(ArrayList<String> models) {
        this.models.addAll(models);
    }
}
