package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationException {

    public boolean ValidfirstName(String firstname) {
        Scanner sc = new Scanner(System.in);
        boolean result = Pattern.matches("^[A-Z]{1}+[a-z]{3,}", firstname);
        try {
            if (result) {
                System.out.println("First Name is Valid");
                return true;
            } else {
                throw new CustomException("First Name is Invalid: Please Enter Valid First Name: ");
            }
        } catch (CustomException e) {
            System.out.printf(e.getMessage());
        }
        return false;
    }


    public boolean ValidLastName(String lname) {
        Scanner sc = new Scanner(System.in);
        boolean result = Pattern.matches("^([A-Z]{1})([a-z A-Z]{2,})$", lname);
        try {
            if (result) {
                System.out.println("Last Name is Valid: ");
                return true;
            } else {
                throw new CustomException("Last Name is Invalid\n. Please Enter Last Valid Name: ");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean ValidEmail(String email){
        Scanner sc = new Scanner(System.in);
        boolean result = Pattern.matches("^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$",email);
        try {
            if (result) {
                System.out.println("Email is Valid: ");
            }
            else {
                throw new CustomException("Email is Invalid. Please Enter Valid Email");
            }
            return true;
        }
            catch(CustomException e){
                System.out.println(e.getMessage());
            }
        return false;
    }
}