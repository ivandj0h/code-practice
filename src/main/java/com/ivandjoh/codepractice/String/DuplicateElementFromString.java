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

        String value = "junadjoh";
        String[] args = value.split("");
        Map<String, Long> map = (Map<String, Long>) Arrays.stream(args)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        logger.info("{}", map);
    }
}
