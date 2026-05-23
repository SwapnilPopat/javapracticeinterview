package com.practice.practiceinterview.commondatatypes;
import java.util.*;

public class commondatatypes {
    public static void main(String[] args) {
        // Primitive Data Types
        int myInt = 42;
        double myDouble = 3.14;
        boolean myBoolean = true;
        char myChar = 'A';

        // Reference Data Types
        String myString = "Hello, World!";
        int[] myArray = {1, 2, 3, 4, 5};

        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        System.out.println("Array" + myList.get(1));

        Map<String, Integer> hits = new HashMap<>();

        hits.put("/login", hits.getOrDefault("/login", 0) + 1);
        hits.put("/login", hits.getOrDefault("/login", 0) + 1);
        hits.put("/orders", hits.getOrDefault("/orders", 0) + 1);

        System.out.println(hits); 
    }
}