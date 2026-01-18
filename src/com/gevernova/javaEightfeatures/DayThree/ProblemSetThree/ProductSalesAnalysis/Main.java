package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.ProductSalesAnalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void filter(List<Sale> sales){
        sales.stream().filter(s->s.getQuantity()>10).forEach(System.out::println);
    }
    public static  List<ProductSales> Transform(List<Sale> sales){
        return sales.stream().map(s->new ProductSales(s.productId,s.getQuantity()*s.getPrice())).toList();
    }
    public static void sortedListOnBasisOfTR(List<ProductSales> newlist){
        newlist.stream().sorted((a,b)->b.getTr()-a.getTr()).forEach(System.out::println);
    }
    public static  void getTopFiveReturn(List<ProductSales> newlist){
        newlist.stream()
                .sorted((a,b)->b.getTr()-a.getTr())
                .limit(5)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Sale> sales=new ArrayList<>(
                List.of(
                     new Sale(1,20,3000),
                        new Sale(2,30,3000),
                        new Sale(3,40,304),
                        new Sale(4,25,320),
                        new Sale(5,23,35000),
                        new Sale(6,24,45000),
                        new Sale(7,22,4000),
                        new Sale(8,45,380),
                        new Sale(9,70,300)
                )
        );
        System.out.println("---- filtered list ----");
        filter(sales);
        System.out.println("--- productsales ---");


        List<ProductSales> newlist=Transform(sales);
        System.out.println(newlist);

        System.out.println("--- sorted list ----");
        sortedListOnBasisOfTR(newlist);

        System.out.println("--- top 5 total returns list ----");
        getTopFiveReturn(newlist);
    }
}
