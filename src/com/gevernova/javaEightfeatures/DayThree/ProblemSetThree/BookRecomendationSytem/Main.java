package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.BookRecomendationSytem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public  static  void  filter(List<Book> books){
        books.stream()
                .filter(s->s.getGenre().equalsIgnoreCase("Science Fiction"))
                .filter(s->(s.rating>4))
                .forEach(System.out::println);
    }
    public static  List<BookRecomendation> Transform(List<Book> books){
        return books.stream()
                .map(s->new BookRecomendation(s.title,s.rating))
                .toList();
    }
    public static  void sorted(List<BookRecomendation> newlist){
        newlist.stream()
                .sorted((a,b)->Double.compare(b.rating,a.rating))
                .forEach(System.out::println);
    }
    public static  void pagination(List<BookRecomendation> newlist){
        List<BookRecomendation> top10 = newlist.stream()
                .sorted((a,b)->Double.compare(b.rating,a.rating))
                .limit(10)
                .toList();

        int pageSize = 5;
        int totalPages = (int) Math.ceil(top10.size() / (double) pageSize);

        for (int page = 1; page <= totalPages; page++) {
            int start = (page - 1) * pageSize;
            int end = Math.min(start + pageSize, top10.size());
            List<BookRecomendation> pageBooks = top10.subList(start, end);

            System.out.println("Page " + page + ":");
            pageBooks.forEach(System.out::println);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>(
                List.of(
                        new Book("mercury vs venus","shiva","science fiction",4.5),
                        new Book("comedy night with kapil","shiva","comedy",4.5),
                        new Book("king maker","shiva","history",4.5),
                        new Book("mercury is king","shiva","science fiction",4.5),
                        new Book("sunil pal comedy","shiva","comedy",4.5),
                        new Book("jupiter will  fall on earth","shiva","science fiction",3.5)
                )
        );
        System.out.println("----- print filtered list -----");
        filter(books);

        System.out.println("--- transformed List ----");
        List<BookRecomendation> newlist=Transform(books);
        System.out.println(newlist);

        System.out.println("--- sorted list ----");
        sorted(newlist);

        System.out.println("--- pagination implemented ---");
        pagination(newlist);
    }
}
