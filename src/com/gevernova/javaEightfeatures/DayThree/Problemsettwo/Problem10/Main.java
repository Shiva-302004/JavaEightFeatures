package com.gevernova.javaEightfeatures.DayThree.Problemsettwo.Problem10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(today.getYear(), 7, 30);
        if(birthday.isBefore(today)){
            birthday = birthday.plusYears(1);
        }
        System.out.println(ChronoUnit.DAYS.between(today, birthday));
    }
}
