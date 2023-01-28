package com.ivandjoh.codepractice.collections.generics;

import java.io.Serializable;

public class Printer <T extends Animal & Serializable> {

    T thinkToPrint;

    public Printer(T thinkToPrint) {
        this.thinkToPrint = thinkToPrint;
    }

    public void print() {
        thinkToPrint.eat();
        System.out.println(thinkToPrint);
    }

    // Generic Method
    public static <T> void print(T thingToPrint) {
        System.out.println(thingToPrint);
    }

    public static void main(String[] args) {
        // Generic Method
      print("This is came from generic method");

        Printer<Dog> dogPrinter = new Printer<>(new Dog("This is a dog"));
        dogPrinter.print();

        Printer<Cat> catPrinter = new Printer<>(new Cat("This is a cat"));
        catPrinter.print();
    }
}
