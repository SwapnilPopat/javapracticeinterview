package com.practice.practiceinterview.lamdaexamples;
import java.util.*;

// If you want to pass logic as a parameter, functional interfaces make that possible.
@FunctionalInterface
interface MyFunctionalInterface {
    void sayMessage(String message);
}
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

// Example 1: Simple Lambda
public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression implementing the interface
        MyFunctionalInterface msg = (message) -> {
            System.out.println("Message: " + message);
        };

        msg.sayMessage("Hello, Lambda1!");

       // Example 2: Lambda with Return Value
        MathOperation add = (a, b) -> a + b;

        // Lambda for multiplication
        MathOperation multiply = (a, b) -> a * b;

        System.out.println("Sum: " + add.operate(5, 3));
        System.out.println("Product: " + multiply.operate(5, 3));

        // Example 3: Lambda with Collections

         List<String> names = Arrays.asList("John", "Alice", "Bob");

        // Using lambda with forEach
        names.forEach(name -> System.out.println(name));
    }
}
 

