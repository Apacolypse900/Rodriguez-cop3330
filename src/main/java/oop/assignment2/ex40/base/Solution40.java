package oop.assignment2.ex40.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution40 {
    private static final Scanner myObj = new Scanner(System.in);

    private static String Search;

    public static void main(String[] args) {
        System.out.println("Enter a search String; ");
            Search = myObj.next();
        Map();


    }
    public static void Map() {
        HashMap<String,String> Employee = new HashMap<String,String>();
        Employee.put("John Johnson\t\t\t |Manager\t     ", "2016-12-31");
        Employee.put("Tou Xiong\t\t\t\t |Software Engineer", "2016-10-06");
        Employee.put("Micheala Michealson\t\t |District Manager", "2016-12-19");
        Employee.put("Jake Jacobson\t\t\t |Programmer\t", "");
        Employee.put("Jacquelyn Jackson\t\t |DBA\t\t    ", "");
        Employee.put("Sally Webber\t\t\t |Web Developer  ", "2015-12-18");

        //Employee.containsKey(Search);
        //if(Search.equals(true))
        System.out.println(Employee.containsKey(Search));

    }

}
