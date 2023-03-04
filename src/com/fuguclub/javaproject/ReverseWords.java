package com.fuguclub.javaproject;

import java.util.Scanner;

public class ReverseWords {

    public void reverse(String name) {
        char[] number = name.toCharArray();
        String word = "";

        int inversedNumber = 0;
        for (int i = 0; i < name.length(); i++) {
            inversedNumber = name.length() - (i + 1);
            char currentChar = number[inversedNumber];
            word += currentChar;
        }
        System.out.println(word);
    }
}
