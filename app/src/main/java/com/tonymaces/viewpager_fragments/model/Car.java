package com.tonymaces.viewpager_fragments.model;

/**
 * Created by tonym on 06/08/2016.
 */
public class Car {
    private  int photo;
    private String name;

    public Car(int photo, String name) {
        this.photo = photo;
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
