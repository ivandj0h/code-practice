package com.ivandjoh.codepractice.collections.generics;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {

    private String color;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
