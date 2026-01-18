package com.gevernova.javaEightfeatures.DayTwo.UserRegistrationProblem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserValidation<String, Boolean> FirstNameValidation =
                (String FirstName) -> FirstName.matches("^[A-Z][a-z]{2,}$");

        UserValidation<String, Boolean> LastNameValidation =
                (String LastName) -> LastName.matches("^[A-Z][a-z]{2,}$");

        UserValidation<String, Boolean> EmailValidation =
                (String Email) -> Email.matches("^[a-zA-Z0-9]+[.+_-]?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$");

        UserValidation<String, Boolean> MobileValidation =
                (String Mobile) -> Mobile.matches("^[0-9]{2}\\s[0-9]{10}$");

        UserValidation<String, Boolean> PasswordValidation =
                (String Password) -> Password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$");

        System.out.println("------------------------------");
        System.out.println("Please Enter The First Name");
        String FirstName = sc.next();
        while(!FirstNameValidation.ValidateUserCredentials(FirstName)){
            System.out.println("Please Provide the valid input");
            FirstName = sc.next();
        }

        System.out.println("------------------------------");
        System.out.println("Please Enter The Last Name");
        String LastName = sc.next();
        while(!LastNameValidation.ValidateUserCredentials(LastName)){
            System.out.println("Please Provide the valid input");
            LastName = sc.next();
        }

        System.out.println("------------------------------");
        System.out.println("Please Enter The Email");
        String Email = sc.next();
        while(!EmailValidation.ValidateUserCredentials(Email)){
            System.out.println("Please Provide the valid input");
            Email = sc.next();
        }

        System.out.println("------------------------------");
        System.out.println("Please Enter The Mobile Number");
        String Mobile = sc.nextLine();
        while(!MobileValidation.ValidateUserCredentials(Mobile)){
            System.out.println("Please Provide the valid input");
            Mobile = sc.nextLine();
        }

        System.out.println("------------------------------");
        System.out.println("Please Enter The Password");
        String Password = sc.next();
        while(!PasswordValidation.ValidateUserCredentials(Password)){
            System.out.println("Please Provide the valid input");
            Password = sc.next();
        }

        System.out.println("------------------------------");
        System.out.println(FirstName + " " + LastName + " Congratulations on successful Registration");
    }
}
