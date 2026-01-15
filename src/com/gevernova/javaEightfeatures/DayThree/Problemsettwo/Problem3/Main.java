package com.gevernova.javaEightfeatures.DayThree.Problemsettwo.Problem3;

import java.time.Duration;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneOffset.UTC);
        ZonedDateTime localTime = ZonedDateTime.now();
        // when localedate then period
        // when zonedatetime then duration
        Duration duration = Duration.between(utcTime, localTime);

        System.out.println("Difference: " + Math.abs(duration.toHours()) + " hours "
                + Math.abs(duration.toMinutes() % 60) + " minutes");
    }
}
