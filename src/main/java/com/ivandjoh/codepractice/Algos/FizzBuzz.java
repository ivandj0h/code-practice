package com.ivandjoh.codepractice.Algos;

/**
 * @author Ivan Djoh
 * @version 1.0
 * @since 2023-01-28

 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz”
 * instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”.
 *
 */
public class FizzBuzz {

    static void fizzBuzz() {
        int number = 1;
        while (number <= 30) {
            System.out.println(number % 15 == 0 ? "FizzBuzz" : number % 3 == 0 ? "Fizz" : number % 5 == 0 ? "Buzz" : number);
            number++;
        }
    }

    public static void executeFizzBuzz() {
        fizzBuzz();
    }
}
