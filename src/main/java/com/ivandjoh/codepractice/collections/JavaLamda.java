package com.ivandjoh.codepractice.collections;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-01-28

 * Lamda expressions are used primarily to define inline implementation of a functional interface,
 * i.e., an interface with a single method only. In the following example, we have defined a functional interface
 *
 */
public class JavaLamda {

    @FunctionalInterface
    interface MyFunctionalInterface {
        String sayHello();
    }

    static void exJavaLamda() {
        MyFunctionalInterface msg = () -> "Hello";
        System.out.println(msg.sayHello());
    }

    public static void main(String[] args) {
        // Activate it to see the result
       // exJavaLamda();
    }
}
