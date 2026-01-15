package com.gevernova.javaEightfeatures.DayThree.Problemsettwo.Problem8;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        int year=Year.now().getValue();

        if(Year.isLeap(year)){
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }
}
