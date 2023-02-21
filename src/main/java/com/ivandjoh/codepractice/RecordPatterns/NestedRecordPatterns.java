package com.ivandjoh.codepractice.RecordPatterns;

public class NestedRecordPatterns {

    record Point(int x, int y) {
    }

    record Total(Point p1, Point p2) {
    }

    static void printSum(Object o) {
        // record nested pattern
        if (o instanceof Total(Point(int x,int y),Point(int x2,int y2))) {
            System.out.println(x + y + x2 + y2);
        }
    }


    public static void executeNestedRecordPatterns(String[] args) {
        printSum(new Total(new Point(10, 5), new Point(2, 3)));
    }
}

