package com.gevernova.javaEightfeatures.DayThree.Problemsettwo.Problem1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start date (yyyy-MM-dd):");
        LocalDate start = LocalDate.parse(sc.next());

        System.out.println("Enter end date (yyyy-MM-dd):");
        LocalDate end = LocalDate.parse(sc.next());

        Period period = Period.between(start, end);

        System.out.println("Difference: "
                + period.getYears() + " years, "
                + period.getMonths() + " months, "
                + period.getDays() + " days");
    }
}
