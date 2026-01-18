package com.gevernova.javaEightfeatures.DayTwo.AddressBook;

import java.util.Objects;

public class Person {

    String firstName;
    String lastName;
    String city;
    String zip;
    String state;

    public Person(String firstName, String lastName, String city, String zip, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return firstName.equals(p.firstName) && lastName.equals(p.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }
}
