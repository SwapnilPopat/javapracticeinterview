package com.practice.practiceinterview.streamexample;

import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Tom", "Jerry");

        // Stream pipeline: filter names starting with 'J', convert to uppercase, collect to list
        List<String> result = names.stream()
                                   .filter(name -> name.startsWith("J")) // Intermediate
                                   .map(String::toUpperCase)             // Intermediate
                                   .sorted()                              // Intermediate
                                   .collect(Collectors.toList());        // Terminal

        System.out.println("Filtered Names: " + result);

        // Parallel Streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            int sum = numbers.parallelStream()
                            .mapToInt(Integer::intValue)
                            .sum();
            System.out.println("Sum: " + sum);

    }
}
