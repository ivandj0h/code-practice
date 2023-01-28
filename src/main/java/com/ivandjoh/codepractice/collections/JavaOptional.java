package com.ivandjoh.codepractice.collections;

import java.util.Optional;

public class JavaOptional {

    static class Cat {
        String name;
        String color;
        String breed;

        public Cat(String name, String color, String breed) {
            this.name = name;
            this.color = color;
            this.breed = breed;
        }
    }

    static void exJavaOptional() {
        Optional<Cat> optionalCat = findCatByName();
        if (optionalCat.isPresent()) {
            System.out.println("Cat found: " + optionalCat.get().name + " " + optionalCat.get().color + " " + optionalCat.get().breed);
        } else {
            System.out.println("Cat not found");
        }
    }

    private static Optional<Cat> findCatByName() {
        Cat cat = new Cat("Tom", "Black", "Persian");

        return Optional.of(cat);
    }

    public static void main(String[] args) {
        exJavaOptional();
    }
}
