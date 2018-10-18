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
        this.models = new ArrayList<>();
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
        models.add(model);
    }

    public void addModels(String[] _models) {
        this.models.addAll(models);
    }

    /*
    public void setModels(String[] models) {
        this.models = models;
    }

    public void addModel(String model) {
        Object[] temp = null;
        if (this.models == null) {
            this.models = new Object[1];
            this.models[0] = model;
        } else {
            temp = new Object[this.models.length];

            for (int i = 0; i < this.models.length; i++) {
                temp[i] = this.models[i];
            }

            temp[this.models.length] = model;

            this.models = new Object[this.models.length + 1];
            this.models = temp;
        }
    }

    public void addModels(String[] _models) {

        Object[] temp = null;
        if (this.models == null) {
            this.models = new Object[_models.length];
            this.models = _models;
        } else {
            temp = new Object[this.models.length + _models.length];

            for (int i = 0; i < this.models.length + _models.length; i++) {
                if (i < this.models.length) {
                    temp[i] = this.models[i];
                } else {
                    temp[i] = _models[i - this.models.length];
                }
            }

            this.models = new Object[this.models.length + _models.length];
            this.models = temp;
        }
    */
}
