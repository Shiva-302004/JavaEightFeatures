package com.gevernova.javaEightfeatures.Problemsetone.Problem9;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        Optional.ofNullable(input).map(String::toUpperCase).ifPresent(System.out::println);
    }
}
