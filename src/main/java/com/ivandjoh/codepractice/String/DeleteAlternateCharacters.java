package com.ivandjoh.codepractice.String;

public class DeleteAlternateCharacters {

    public static void executeDeleteAlternateCharacters(String args) {
        System.out.println("String after deleting alternate characters is " + deleteAlternateCharacters(args));
    }

    private static String deleteAlternateCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
