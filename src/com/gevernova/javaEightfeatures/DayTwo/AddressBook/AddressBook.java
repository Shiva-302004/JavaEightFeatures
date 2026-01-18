package com.gevernova.javaEightfeatures.DayTwo.AddressBook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

    private List<Person> Members = new ArrayList<>();

    // Ability to ensure there is no Duplicate
    // Entry of the same Person in a particular
    // Address book
    public boolean addMembers(Person person){
        boolean exists = Members.stream().anyMatch(p -> p.equals(person));
        if(exists){
            System.out.println("Duplicate entry found");
            return false;
        }
        Members.add(person);
        return true;
    }

    // Ability to search Person
    // in a City or State across
    // the multiple
    // AddressBook
    public void searchByCityOrState(String city){
        Members.stream()
                .filter(p -> p.getCity().equalsIgnoreCase(city) || p.getState().equalsIgnoreCase(city))
                .forEach(a -> System.out.println(a.firstName + " " + a.lastName + " " + a.city + " " + a.state + " " + a.zip));
    }

    // Ability to view Persons
    // by City or State
    public void GroupByCity(){
        Members.stream()
                .collect(Collectors.groupingBy(Person::getCity))
                .forEach((city, list) -> {
                    System.out.println("City: " + city);
                    list.forEach(a -> System.out.println(a.firstName + " " + a.lastName + " " + a.city + " " + a.state + " " + a.zip));
                });
    }

    public void GroupByState(){
        Members.stream()
                .collect(Collectors.groupingBy(Person::getState))
                .forEach((state, list) -> {
                    System.out.println("City: " + state);
                    list.forEach(a -> System.out.println(a.firstName + " " + a.lastName + " " + a.city + " " + a.state + " " + a.zip));
                });
    }

    public void printCountByCity(){
        Members.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()))
                .forEach((city, count) -> System.out.println(city + "->" + count));
    }

    public void printCountByState(){
        Members.stream()
                .collect(Collectors.groupingBy(Person::getState, Collectors.counting()))
                .forEach((state, count) -> System.out.println(state + "->" + count));
    }

    public void printSortedByName(){
        Members.stream()
                .sorted((a, b) -> (a.firstName + b.lastName).compareTo(a.firstName + b.lastName))
                .forEach(a -> System.out.println(a.firstName + " " + a.lastName + " " + a.city + " " + a.state + " " + a.zip));
    }

    public void printSortedByCity(){
        Members.stream()
                .sorted((a, b) -> a.getCity().compareTo(b.getCity()))
                .forEach(a -> System.out.println(a.firstName + " " + a.lastName + " " + a.city + " " + a.state + " " + a.zip));
    }

    public void printSortedByState(){
        Members.stream()
                .sorted((a, b) -> a.getState().compareTo(b.getState()))
                .forEach(a -> System.out.println(a.firstName + " " + a.lastName + " " + a.city + " " + a.state + " " + a.zip));
    }

    public void printSortedByZip(){
        Members.stream()
                .sorted((a, b) -> a.getZip().compareTo(b.getZip()))
                .forEach(a -> System.out.println(a.firstName + " " + a.lastName + " " + a.city + " " + a.state + " " + a.zip));
    }
}
