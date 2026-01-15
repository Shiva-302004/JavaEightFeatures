package com.gevernova.javaEightfeatures.DayThree.Problemsetone.Problem3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("shiva", "jay", "aryan");
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);
    }
}
