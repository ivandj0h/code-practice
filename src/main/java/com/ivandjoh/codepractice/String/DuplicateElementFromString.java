package com.ivandjoh.codepractice.String;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementFromString {

    private static final Logger logger = LoggerFactory.getLogger(CountOccurrenceOfEachCharacterInString.class);

    public static void executeDuplicateElementFromString() {

        String value = "dave djoh";
        String[] args = value.split("");

        // Duplicate element from String
        Map<String, Long> duplicate = (Map<String, Long>) Arrays.stream(args)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        logger.info("{}", duplicate);

        // Unique element from String
        Map<String, Long> unique = (Map<String, Long>) Arrays.stream(args)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        logger.info("{}", unique);
    }
}
