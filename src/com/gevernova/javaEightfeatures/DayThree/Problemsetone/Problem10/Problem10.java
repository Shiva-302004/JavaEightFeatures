package com.gevernova.javaEightfeatures.DayThree.Problemsetone.Problem10;

public class Problem10 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Calculator add = Problem10::add;
        Calculator sub = Problem10::subtract;
        Calculator mul = Problem10::multiply;
        Calculator div = Problem10::divide;

        System.out.println(add.calculate(10, 5));
        System.out.println(sub.calculate(10, 5));
        System.out.println(mul.calculate(10, 5));
        System.out.println(div.calculate(10, 5));
    }
}
