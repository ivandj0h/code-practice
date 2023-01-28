package com.ivandjoh.codepractice.collections;

/**
 * @author Ivan Djohar
 * @version 1.0
 * @since 2023-01-28

 * Java Generic
 * Generics means parameterized types.
 */
public class JavaGenerics {

    static class GenericPrinter <T> {
        T thinkToPrint;

        public GenericPrinter(T thinkToPrint) {
            this.thinkToPrint = thinkToPrint;
        }

        void print() {
            System.out.println("This is Generics : " + thinkToPrint);
        }
    }

    public static void executeGeneric() {
        GenericPrinter<Integer> integerPrinter = new GenericPrinter<>(1);
        integerPrinter.print();

        GenericPrinter<String> stringPrinter = new GenericPrinter<>("Hello World");
        stringPrinter.print();
    }
}
