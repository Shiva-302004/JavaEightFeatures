package com.gevernova.javaEightfeatures.DayThree.Problemsetone.Problem1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printSquare(int n) {
        System.out.println(n * n);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(Main::printSquare);
    }
}
