package com.ivandjoh.codepractice.RecordPatterns;

public class NormalRecordPatterns {

    record Person(String name, int age) {
    }

    static void normalRecordPatterns(Object o) {
        if (o instanceof Person p) {
            System.out.println("My Name is : " + p.name() + " " +
                    "and I am " + p.age() + " years old.");
        }
    }

    public static void executeNormalRecordPatterns(String[] args) {
        normalRecordPatterns(new Person("Ivan", 30));
    }
}
