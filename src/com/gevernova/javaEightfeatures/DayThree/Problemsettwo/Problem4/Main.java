package com.gevernova.javaEightfeatures.DayThree.Problemsettwo.Problem4;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate firstDay = today.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("First day: " + firstDay);
        System.out.println("Last day: " + lastDay);
    }
}
