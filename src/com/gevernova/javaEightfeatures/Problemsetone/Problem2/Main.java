package com.gevernova.javaEightfeatures.Problemsetone.Problem2;

import java.util.Arrays;
import java.util.List;

public class Main {
    static  class Person {
        private String name;

        Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice"),
                new Person("Bob"),
                new Person("Charlie")
        );
        people.stream().map(Person::getName).forEach(System.out::println);
    }
}
