package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.EmployeeDataProcessing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> Employees=new ArrayList<>(
                List.of(
                        new Employee(1,"shiva verma","engineering",100000),
                        new Employee(2,"komal raj verma","dt",90000),
                        new Employee(3,"shiv kumar","hr",90000),
                        new Employee(4,"shivanshu verma","engineering",80000),
                        new Employee(5,"shivani verma","engineering",60000),
                        new Employee(6,"shivam","dt",80000),
                        new Employee(7,"manya","hr",80000)
                )
        );


        Employees.stream()
                .filter(s->s.getDepartment().equalsIgnoreCase("engineering"))
                .filter(s->(s.getSalary()>=80000))
                .forEach(System.out::println);



        Employees.stream()
                .sorted((a,b)->b.getSalary()-a.getSalary())
                .forEach(System.out::println);


        Map<String,List<String>> mp=Employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName,
                                Collectors.toList())));
        System.out.println(mp);


        Map<String,Double> map=Employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(map);
    }
}
