package com.punto_rojo.nosavvy.ubereats.models;

/**
 * Created by nosavvy on 3/27/18.
 */

public class Food {
    private int id;
    private String name;
    private String time;
    private String picture;

    public Food(int id, String name, String time, String picture) {
        this.setId(id);
        this.setName(name);
        this.setTime(time);
        this.setPicture(picture);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
