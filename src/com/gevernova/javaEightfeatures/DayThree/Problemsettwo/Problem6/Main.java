package com.gevernova.javaEightfeatures.DayThree.Problemsettwo.Problem6;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant start = Instant.now();
        for (int i = 0; i < 100; i++) {}
        Instant end = Instant.now();

        long timeTaken = Duration.between(start, end).getSeconds();
        System.out.println("Execution time: " + timeTaken + " seconds");
    }
}
