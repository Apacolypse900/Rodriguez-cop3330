package oop.assignment2.ex27.base;

public class validateInput {
    public static String Fname(String FirstName){
        if(FirstName == " "){
            return "The first name must be filled in";
        }
        if(FirstName.length() < 2){
            return "The first name must be at least two characters long";
        }
        else
            return "1";
    }

    public static String Lname(String LastName){
        if(LastName == " "){
            return "The last name must be filled in";
        }
        if(LastName.length() < 2){
            return "The Last name must be at least two characters long";
        }
        else
            return "1";
    }

    public static String validzip(String zip) {
        for (char c : zip.toCharArray()) {
            if (Character.isDigit(c)) {
                return "1";
            } else
                return "The zipcode must be a 5 digital number";
        }
        return "1";
    }

    public static String EmployeeID(String eID){
        for (int i = 0; i < eID.length(); i++){
            if(i <= 2) {
                for (char d : eID.toCharArray()) {
                    if (Character.isLetter(d))
                        return "1";
                    else
                        return"The employee ID must be in the format of AA-1234";
                }
            }
            if(i == 3){
                for(char sp : eID.toCharArray()){
                    if(sp != '-') {
                        return "The employee ID must be in the format of AA-1234";
                    }
                    else
                        return "1";
                    }
            }

            if(i > 3){
                for(char n : eID.toCharArray()){
                    if (Character.isDigit(n))
                        return "1";
                    else
                        return "The employee ID must be in the format of AA-1234";
                }
            }

            if(i > 7)
                return "The employee ID must be in the format of AA-12345";
        }
        return "1";
    }
}
