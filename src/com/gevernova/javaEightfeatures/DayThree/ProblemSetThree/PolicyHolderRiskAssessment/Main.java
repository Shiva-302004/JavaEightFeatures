package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.PolicyHolderRiskAssessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    // create a filter method to filter list of policyholders
    // to get people with age >60 && policytype==life
    public static void filter(List<PolicyHolder> policyHolderList){
        policyHolderList.stream()
                .filter(s->s.getPolicyType().equalsIgnoreCase("life"))
                .filter(s->s.getAge()>60)
                .forEach(System.out::println);
    }
    // create a new list of RiskAssement containg holderid ,name,risk score
    public static  List<RiskHolder> Transform(List<PolicyHolder> policyHolderList){
        return policyHolderList.stream()
                .map(s->new RiskHolder(s.getHolderId(),s.getName(), (s.getPremiumAmount())/s.getAge()))
                .toList();
    }
    // sort risk assessement by risk score in descending order
    public static List<RiskHolder> Sort(List<RiskHolder> riskHolders){
        return riskHolders.stream().sorted((a,b)->Double.compare(b.getScore(),a.getScore())).toList();
    }
    public static Map<String,List<String>> group(List<RiskHolder> riskHolders){
        return  riskHolders.stream().collect(Collectors.groupingBy(p->(p.getScore()<0.5)?"low risk":"high risk",Collectors.mapping(RiskHolder::getName,Collectors.toList())));
    }
    public static void main(String[] args) {
        List<PolicyHolder> policyHolderList=new ArrayList<>();
        policyHolderList.add(new PolicyHolder(1,"Shiva Verma",72,"Life",25.00));
        policyHolderList.add(new PolicyHolder(2,"Shivam Verma",56,"education",10.00));
        policyHolderList.add(new PolicyHolder(3,"Shivanshu Verma",43,"Life",15.00));
        policyHolderList.add(new PolicyHolder(4,"Shivani Verma",26,"life",25.00));
        policyHolderList.add(new PolicyHolder(5,"Shiv Verma",28,"education",25.00));
        policyHolderList.add(new PolicyHolder(6,"Shivang Verma",24,"life",50.00));
        policyHolderList.add(new PolicyHolder(7,"Shiva Kumar",43,"education",50.00));
        policyHolderList.add(new PolicyHolder(8,"Komal Raj",32,"life",50.00));
        policyHolderList.add(new PolicyHolder(9,"Shiva Raj",62,"life",15.00));


        // filter method
        System.out.println("---- Filtered List ----");
        filter(policyHolderList);
        // transform method
        System.out.println("---- Transform List ----");
        List<RiskHolder> riskHolders=Transform(policyHolderList);
        riskHolders.forEach(System.out::println);
        //sort
        System.out.println("---- sorted list ------");
        List<RiskHolder> sortedRiskHolders=Sort(riskHolders);
        sortedRiskHolders.forEach(System.out::println);
        // Group sorted risk policy in
        // two parts
        // 1) high risk -> risk >0.5
        // 2) low risk -> risk <0.5
        Map<String ,List<String>> map=group(sortedRiskHolders);
        System.out.println(map);
    }
}
