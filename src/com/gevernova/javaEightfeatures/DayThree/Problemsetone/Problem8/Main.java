package com.gevernova.javaEightfeatures.DayThree.Problemsetone.Problem8;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people=new Random()
                .ints(20,25,30)
                .mapToObj(Person::new)
                .collect(Collectors.toList());
        people.forEach(System.out::println);
    }
}
