package com.gevernova.javaEightfeatures.DayThree.Problemsetone.Problem4;

public class Main {

    public static void main(String[] args) {
        ShapeCreator sp=Rectangle::new;
        Rectangle r=sp.create(10,20);
        System.out.println(r);
    }
}
