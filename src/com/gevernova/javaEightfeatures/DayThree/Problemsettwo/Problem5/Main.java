package com.gevernova.javaEightfeatures.DayThree.Problemsettwo.Problem5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String input = "15-Jan-2022 14:30:00";

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");

        LocalDateTime dateTime = LocalDateTime.parse(input, inputFormatter);

        DateTimeFormatter outputFormatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        System.out.println(dateTime.format(outputFormatter));
    }
}
