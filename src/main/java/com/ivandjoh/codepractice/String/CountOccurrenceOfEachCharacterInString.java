package com.ivandjoh.codepractice.String;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrenceOfEachCharacterInString {

    private static final Logger logger = LoggerFactory.getLogger(CountOccurrenceOfEachCharacterInString.class);

    public static void executeCountOccurrenceOfEachCharacterInString() {
        String str = "ilovejavatechie";
        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        logger.info("{}", map);
    }
}
