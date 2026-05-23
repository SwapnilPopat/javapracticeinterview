package com.practice.practiceinterview.runnable;
public class RunnableExample {
       public static void main(String[] args) {
        // Create Runnable instance
        Runnable task = new MyTask();

        // Create Thread objects and pass Runnable
        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        // Start threads
        t1.start();
        t2.start();
    }
}
