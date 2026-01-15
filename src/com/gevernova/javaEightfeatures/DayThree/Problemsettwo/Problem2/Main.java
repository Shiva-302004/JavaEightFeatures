package com.gevernova.javaEightfeatures.DayThree.Problemsettwo.Problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String input= "2026-01-14";

        LocalDate date = LocalDate.parse(input);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(date.format(formatter));
    }
}
