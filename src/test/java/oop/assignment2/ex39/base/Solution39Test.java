package oop.assignment2.ex39.base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    @Test
    void printMap() {
        HashMap<String, String> Employee = new HashMap<String, String>();
        Employee.put("John Johnson\t\t\t |Manager\t     ", "2016-12-31");
        Employee.put("Tou Xiong\t\t\t\t |Software Engineer", "2016-10-06");
        Employee.put("Micheala Michealson\t\t |District Manager", "2016-12-19");
        Employee.put("Jake Jacobson\t\t\t |Programmer\t", "");
        Employee.put("Jacquelyn Jackson\t\t |DBA\t\t    ", "");
        Employee.put("Sally Webber\t\t\t |Web Developer  ", "2015-12-18");

        java.util.Map<String, String> treeMap = new TreeMap<String, String>(Employee);
        printMap(treeMap);
    }
        public static <n, m> void printMap(Map<n, m> map){
            for(Map.Entry<n,m> entry : map.entrySet()){
                System.out.println("" + entry.getKey() + "\t\t|" + entry.getValue());
            }
        }
    }