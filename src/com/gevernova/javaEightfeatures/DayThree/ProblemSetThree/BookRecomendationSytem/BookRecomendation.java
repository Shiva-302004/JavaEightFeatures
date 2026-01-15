package com.gevernova.javaEightfeatures.DayThree.ProblemSetThree.BookRecomendationSytem;

public class BookRecomendation {
    String title;
    double rating;

    public BookRecomendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "BookRecomendation{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
