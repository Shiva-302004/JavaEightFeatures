package com.gevernova.javaEightfeatures.DayTwo.AddressBook;

public class Main {
    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        book.addMembers(new Person("Shiva", "Verma", "Gaya", "800", "Bihar"));
        book.addMembers(new Person("Shiva", "Kumar", "Bhagalpur", "400", "Assam"));
        book.addMembers(new Person("Komal", "Verma", "Siwan", "300", "Maharashtra"));
        book.addMembers(new Person("Aryan", "Verma", "Jehanabad", "100", "Kerala"));

        System.out.println("--------------------Search By City Or State--------------------");
        book.searchByCityOrState("Gaya");

        System.out.println("--------------------Group By City--------------------");
        book.GroupByCity();

        System.out.println("--------------------Group By State--------------------");
        book.GroupByState();

        System.out.println("--------------------Print By Count of City--------------------");
        book.printCountByCity();

        System.out.println("--------------------Print By Count of State--------------------");
        book.printCountByState();

        System.out.println("--------------------Print By Name in sorted order--------------------");
        book.printSortedByName();

        System.out.println("--------------------Print By state in sorted order--------------------");
        book.printSortedByState();

        System.out.println("--------------------Print By zip in sorted order--------------------");
        book.printSortedByZip();

        System.out.println("--------------------Print By City in sorted order--------------------");
        book.printSortedByCity();

        System.out.println("--------------------------------------------------------------");
    }
}
