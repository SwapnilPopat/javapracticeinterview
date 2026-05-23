package com.practice.practiceinterview.runnable;


//Runnable is a functional interface in the java.lang package used to define a task that can be executed by a thread.
//It is one of the core ways to implement multithreading.
// Implementing Runnable interface
class MyTask implements Runnable {
    @Override
    public void run() {
        // Task to be executed in a separate thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}