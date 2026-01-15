package com.gevernova.javaEightfeatures.DayThree.Problemsettwo.Problem7;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime localTime = ZonedDateTime.now();
        ZonedDateTime otherTime =
                localTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(otherTime);
    }
}
