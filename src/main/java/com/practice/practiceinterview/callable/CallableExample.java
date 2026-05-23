package com.practice.practiceinterview.callable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        // Create a Callable task
        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum += i;
                Thread.sleep(200); // Simulate work
            }
            return sum; // Return result
        };

        // Create ExecutorService
        ExecutorService executor = Executors.newSingleThreadExecutor();

        try {
            // Submit task and get Future
            Future<Integer> future = executor.submit(task);

            // Do other work here if needed...

            // Retrieve result (blocks until done)
            Integer result = future.get();
            System.out.println("Sum = " + result);

        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Task execution failed: " + e.getMessage());
        } finally {
            executor.shutdown();
        }
    }
}
