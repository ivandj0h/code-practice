package com.ivandjoh.codepractice.collections.generics;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {

    private String breed;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {}

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "name = '" + name + "'";
    }
}
