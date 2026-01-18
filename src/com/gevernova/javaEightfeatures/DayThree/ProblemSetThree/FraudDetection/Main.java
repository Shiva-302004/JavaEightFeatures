package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.FraudDetection;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void filter(List<Transaction> transactions){
        transactions.stream().filter((s)->{
            return s.isFraudulent && s.getAmount()>10000;
        }).forEach(System.out::println);
    }
    public static Map<String,List<Transaction>> group(List<Transaction> transactions){
        return transactions.stream().
                collect(Collectors.groupingBy(Transaction::getPolicyNumber,Collectors.toList()));
    }
    public static void Aggregate(Map<String,List<Transaction>> map){

        for (Map.Entry<String,List<Transaction>> entry:map.entrySet()){
            String policyNumber = entry.getKey();
            List<Transaction> frauds = entry.getValue();

            int fraudCount = frauds.size();
            double totalFraudAmount = frauds.stream()
                    .mapToDouble(Transaction::getAmount)
                    .sum();
            System.out.println(policyNumber+"  --->  "+fraudCount+" fraudCount "+totalFraudAmount);
        }
    }
    public static void Alert(Map<String,List<Transaction>> map){

        for (Map.Entry<String,List<Transaction>> entry:map.entrySet()){
            String policyNumber = entry.getKey();
            List<Transaction> frauds = entry.getValue();

            int fraudCount = frauds.size();
            double totalFraudAmount = frauds.stream()
                    .mapToDouble(Transaction::getAmount)
                    .sum();
            if (fraudCount > 5 || totalFraudAmount > 50000) {
                System.out.println(" ALERT!");
                System.out.println("Policy Number: " + policyNumber);
                System.out.println("Fraud Count: " + fraudCount);
                System.out.println("Total Fraud Amount: $" + totalFraudAmount);
                System.out.println("----------------------------");
            }
        }
    }

    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction(1, "P101", 15000, LocalDate.now(), true),
                new Transaction(2, "P102", 12000, LocalDate.now(), true),
                new Transaction(3, "P101", 18000, LocalDate.now(), true),
                new Transaction(4, "P102", 9000,  LocalDate.now(), true),
                new Transaction(5, "P101", 20000, LocalDate.now(), false),
                new Transaction(6, "P101", 17000, LocalDate.now(), true),
                new Transaction(7, "P102", 60000, LocalDate.now(), true)
        );

        // filter the list on basis of isFraudlent and amount>10000
        System.out.println("--- filtered List ----");
        filter(transactions);
        // map transactions on basis of policy number
        System.out.println("--- Grouped Map ----");
        Map<String,List<Transaction>> map=group(transactions);
        System.out.println(map);
        System.out.println("---- aggregate -----");
        Aggregate(map);
        Alert(map);
    }
}
