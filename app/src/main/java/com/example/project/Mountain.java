package com.example.project;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain() {
        name="Namn saknas";
        location="plats saknas";
        height=1;
    }

    public Mountain(String n, String l, int h) {
        this.name = n;
        this.location = l;
        this.height = h;
    }

    public Mountain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}