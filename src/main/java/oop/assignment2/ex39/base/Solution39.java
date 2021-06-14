package oop.assignment2.ex39.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import com.sun.source.tree.Tree;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution39 {
    private static final Scanner myObj = new Scanner(System.in);
    private static String search;

    public static void main(String[] args) {
        //create tabular format using maps
        System.out.print("Name\t\t\t\t\t|");
        System.out.print("Position\t\t\t    |");
        System.out.println("Separation Date");
        System.out.println("_______________________________________________________________");
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

        Map<String,String> treeMap = new TreeMap<String, String>(Employee);
        printMap(treeMap);
    }
    public static <n, m> void printMap(Map<n, m> map){
        for(Map.Entry<n,m> entry : map.entrySet()){
            System.out.println("" + entry.getKey() + "\t\t|" + entry.getValue());
        }
    }
}