package com.gevernova.javaEightfeatures.DayThree.Problemsetone.Problem6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static boolean containsA(String s) {
        return s.contains("a");
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("shiva", "jay", "tom", "billu");
        words.stream().filter(Main::containsA).forEach(System.out::println);
    }
}
