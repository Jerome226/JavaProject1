package com.fuguclub.javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseCapitalization {

    @Deprecated
    public void capitalizeOld() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to capitalize:");
        String name = sc.nextLine();
        char[] number = name.toCharArray();
        ArrayList<String> wordList = new ArrayList<>();

        for (int i = 0; i < name.length(); i++) {
            int numberInt = number[i];
            if (numberInt <= 90 && numberInt >= 65) {
                numberInt = numberInt + 32;
            } else if (numberInt <= 122 && numberInt >= 97) {
                numberInt = numberInt - 32;
            }
            char numberChar = (char) numberInt;
            String word = Character.toString(numberChar);
            wordList.add(word);
        }
        //String listString = Arrays.toString(wordList.toArray());
        String listString = String.join("", wordList);
        System.out.println("Output: " + listString);

    }

    public void capitalize(String name) {
        //transforme string en en array
        char[] number = name.toCharArray();
        //On fais un String vide, car sinon il est null
        String word = "";

        for (int i = 0; i < name.length(); i++) {
            char numberToInt = number[i];
            if (numberToInt <= 90 && numberToInt >= 65) {
                numberToInt = (char) (numberToInt + 32);
            } else if (numberToInt <= 122 && numberToInt >= 97) {
                numberToInt = (char) (numberToInt - 32);
            }
            //On peux additioner les chars dans un string???? ok
            word += numberToInt;
        }
        System.out.println(word);
    }

}
