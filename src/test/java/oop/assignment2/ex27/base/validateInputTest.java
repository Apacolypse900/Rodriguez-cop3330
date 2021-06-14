package oop.assignment2.ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validateInputTest {

    @Test
    void fname_false() {
        String FirstName = "j";

        if(FirstName == " "){
            System.out.println("The first name must be filled in");
        }
        if(FirstName.length() < 2){
            System.out.println("The first name must be at least two characters long");
        }
        else
            System.out.println("false");

    }

    @Test
    void fname_true() {
        String FirstName = "Jesus";
        if(FirstName == " "){
            System.out.println("The first name must be filled in");
        }
        if(FirstName.length() < 2){
            System.out.println("The first name must be at least two characters long");
        }
        else
            System.out.println("True");
    }

    @Test
    void lname_false) {
        String LastName = "R";
        if(LastName == " "){
            System.out.println("The last name must be filled in");
        }
        if(LastName.length() < 2){
            System.out.println("The last name must be at least two characters long");
        }
        else
            System.out.println("flase");
    }

    @Test
    void lname_true) {
        String LastName = "Rodriguez";
        if(LastName == " "){
            System.out.println("The last name must be filled in");
        }
        if(LastName.length() < 2){
            System.out.println("The last name must be at least two characters long");
        }
        else
            System.out.println("true");
    }
    @Test
    void validzip_false() {
        String zip = "1"
        for (char c : zip.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println("True");
            } else
                System.out.println("The zipcode must be a 5 digital number");
        }
        System.out.println("false");
    }

    @Test
    void validzip_true() {
        String zip = "12345"
        for (char c : zip.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println("true");
            } else
                System.out.println("The zipcode must be a 5 digital number");
        }
        System.out.println("false");
    }

    @Test
    void employeeID_false() {
    String eID = "AAa-34";
        for (int i = 0; i < eID.length(); i++){
            if(i <= 2) {
                for (char d : eID.toCharArray()) {
                    if (Character.isLetter(d))
                        System.out.println("true");
                    else
                        System.out.println("The employee ID must be in the format of AA-1234");
                }
            }
            if(i == 3){
                for(char sp : eID.toCharArray()){
                    if(sp != '-') {
                        System.out.println("The employee ID must be in the format of AA-1234");
                    }
                    else
                        System.out.println("1");
                }
            }

            if(i > 3){
                for(char n : eID.toCharArray()){
                    if (Character.isDigit(n))
                        System.out.println("1");
                    else
                        System.out.println("The employee ID must be in the format of AA-1234");
                }
            }

            if(i > 7)
                System.out.println("The employee ID must be in the format of AA-12345");
        }
        System.out.println("1");
    }
}

    @Test
    void employeeID_true() {
        String eID = "AA-1234";
        for (int i = 0; i < eID.length(); i++){
            if(i <= 2) {
                for (char d : eID.toCharArray()) {
                    if (Character.isLetter(d))
                        System.out.println("true");
                    else
                        System.out.println("The employee ID must be in the format of AA-1234");
                }
            }
            if(i == 3){
                for(char sp : eID.toCharArray()){
                    if(sp != '-') {
                        System.out.println("The employee ID must be in the format of AA-1234");
                    }
                    else
                        System.out.println("1");
                }
            }

            if(i > 3){
                for(char n : eID.toCharArray()){
                    if (Character.isDigit(n))
                        System.out.println("1");
                    else
                        System.out.println("The employee ID must be in the format of AA-1234");
                }
            }

            if(i > 7)
                System.out.println("The employee ID must be in the format of AA-12345");
        }
        System.out.println("1");
    }
}