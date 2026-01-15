package com.gevernova.javaEightfeatures.DayThree.Problemsetone.Problem5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static <T extends Comparable<T>> T max(List<T> list) {
        return Collections.max(list, Comparable::compareTo);
    }
    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>(List.of(1,34,234,5,345,678));
        System.out.println(max(ll));
    }
}
