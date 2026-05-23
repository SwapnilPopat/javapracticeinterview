package com.practice.practiceinterview.commondatatypes;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class hashmap {
    private static final Logger logger = LoggerFactory.getLogger(hashmap.class);
    public static void main(String[] args) {
       // Create a HashMap with String keys and Integer values
       HashMap<String, Integer> scores = new HashMap<>();
       // Add key-value pairs
       scores.put("Alice", 90);
       scores.put("Bob", 85);
       scores.put("Charlie", 92);
    // Access a value
    logger.info("Alice's score: {}", scores.get("Alice"));
       // Update a value
       scores.put("Bob", 88);
       // Remove a key
       scores.remove("Charlie");
       // Iterate through entries
       for (Map.Entry<String, Integer> entry : scores.entrySet()) {
           logger.info("{} -> {}", entry.getKey(), entry.getValue());
       }
   }
}