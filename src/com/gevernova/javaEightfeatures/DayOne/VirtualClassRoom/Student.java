package com.gevernova.javaEightfeatures.DayOne.VirtualClassRoom;

import java.util.Objects;

public class Student {
    int id; // Number to unique identify a student
    String name; // name of student

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    // over ridding equals method to check uniqueness of student i.e. to prevent duplicate student entries.
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Student s)) return false;
        return id == s.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // used to store object efficiently for easy access
    }
}
