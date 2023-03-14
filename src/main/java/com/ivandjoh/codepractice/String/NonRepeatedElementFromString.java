package com.ivandjoh.codepractice.String;

public class NonRepeatedElementFromString {

    public static void executeNonRepeatedElementFromString() {
        String str = "arjuna djoh";
        System.out.println("First non-repeating character in " + str + " is " + findNonRepeatedElement(str));
    }

    private static String findNonRepeatedElement(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst()
                .map(String::valueOf)
                .orElse("No non-repeated element found");
    }
}
