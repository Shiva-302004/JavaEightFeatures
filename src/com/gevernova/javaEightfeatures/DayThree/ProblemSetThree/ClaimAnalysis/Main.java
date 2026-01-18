package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.ClaimAnalysis;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void filter(List<Claim> claims){
        claims.stream()
                .filter(s->s.getStatus().equalsIgnoreCase("Approved"))
                .filter(s->s.getGetClaimAmount()>5000)
                .forEach(System.out::println);
    }

    public static Map<Integer,List<Integer>> GroupingByDepartment(List<Claim> claims){
        return claims.stream()
                .collect(Collectors.groupingBy(Claim::getPolicyNumber,Collectors.mapping(Claim::getClaimId,Collectors.toList())));
    }
    public static Map<Integer,Double> Aggregate(List<Claim> claims){
        return claims.stream()
                .collect(Collectors.groupingBy(Claim::getPolicyNumber,Collectors.averagingDouble(Claim::getGetClaimAmount)));
    }
    public static void main(String[] args) {
        List<Claim> claims=new ArrayList<>(
                List.of(
                        new Claim(101,2022,40000,"2026-01-12","approved"),
                        new Claim(102,2023,40000,"2026-01-12","pending"),
                        new Claim(103,2022,3000,"2026-01-12","rejected"),
                        new Claim(104,2024,40000,"2026-01-12","approved"),
                        new Claim(105,2022,3000,"2026-01-12","approved"),
                        new Claim(106,2023,40000,"2026-01-12","rejected"),
                        new Claim(107,2022,6000,"2026-01-12","approved"),
                        new Claim(108,2024,45000,"2026-01-12","approved"),
                        new Claim(109,2024,40000,"2026-01-12","rejected"),
                        new Claim(110,2025,40000,"2026-01-12","approved"),
                        new Claim(111,2025,40000,"2026-01-12","rejected")
                )
        );
        System.out.println("--- filtered list on basis of department and salary ---");
        filter(claims);
        System.out.println("---- create map with department and employees names");
        Map<Integer,List<Integer>> mp=GroupingByDepartment(claims);
        System.out.println(mp);
        System.out.println("---- create map with department and average salary");
        Map<Integer,Double> map=Aggregate(claims);
        System.out.println(map);
    }
}
