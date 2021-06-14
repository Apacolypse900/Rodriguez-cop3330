package oop.assignment2.ex24.base;

import java.util.Arrays;
import java.util.Locale;

public class AnagramDetector {
    public boolean isAnagram(String First, String Second){
        String word1 = First.replaceAll("//s", "");
        String word2 = Second.replaceAll("//s", "");

        boolean status = true;
        if(word1.length() != word2.length())
            status = false;
        else{
            char[] ArrayWord1 = word1.toLowerCase().toCharArray();
            char[] ArrayWord2 = word2.toLowerCase().toCharArray();
            Arrays.sort(ArrayWord1);
            Arrays.sort(ArrayWord2);
            status = Arrays.equals(ArrayWord1, ArrayWord2);
        }
        if(status)
            return true;
        else
            return false;
    }
}
