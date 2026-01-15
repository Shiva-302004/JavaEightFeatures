package com.gevernova.javaEightfeatures.DayThree.Problemsettwo.Problem9;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZoneId zone=ZoneId.systemDefault();
        ZonedDateTime now=ZonedDateTime.now(zone);

        boolean isDST=zone.getRules().isDaylightSavings(now.toInstant());

        System.out.println("Daylight Saving Active: " + isDST);
    }
}
