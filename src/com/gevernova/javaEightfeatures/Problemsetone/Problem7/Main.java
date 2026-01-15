package com.gevernova.javaEightfeatures.Problemsetone.Problem7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static String convertToupperCase(String one){
        return one.toUpperCase();
    }
    public static void main(String[] args) {
        List<String> ll=new ArrayList<>(List.of("shiva","komal","jay","arayan"));
        ll.stream().map(Main::convertToupperCase).forEach(System.out::println);
    }
}
