package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.EmployeeDataProcessing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void filter(List<Employee> Employees){
        Employees.stream()
                .filter(s->s.getDepartment().equalsIgnoreCase("engineering"))
                .filter(s->(s.getSalary()>=80000))
                .forEach(System.out::println);
    }
    public  static  void sort(List<Employee> Employees){
        Employees.stream()
                .sorted((a,b)->b.getSalary()-a.getSalary())
                .forEach(System.out::println);
    }
    public static Map<String,List<String>> GroupingByDepartment(List<Employee> Employees){
        return Employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName,
                                Collectors.toList())));
    }
    public static Map<String,Double> Aggregate(List<Employee> Employees){
        return Employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
    }
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
        System.out.println("--- filtered list on basis of department and salary ---");
        filter(Employees);
        System.out.println("---- sorted list on basis of decreasing salary -----");
        sort(Employees);
        System.out.println("---- create map with department and employees names");
        Map<String,List<String>> mp=GroupingByDepartment(Employees);
        System.out.println(mp);
        System.out.println("---- create map with department and average salary");
        Map<String,Double> map=Aggregate(Employees);
        System.out.println(map);
    }
}
