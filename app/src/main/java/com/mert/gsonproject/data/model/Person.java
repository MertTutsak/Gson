package com.mert.gsonproject.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Person {

    @SerializedName("name")
    private String name;

    @SerializedName("age")
    private String age;

    @SerializedName("car")
    private Car car;

    public Person(String name, String age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
