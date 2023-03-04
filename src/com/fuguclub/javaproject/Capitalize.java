package com.fuguclub.javaproject;

import java.util.Scanner;

public class Capitalize {

    public void capitalize(String divider, String name) {
        String[] words = name.strip().split(divider);

        String wordFinal = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                char[] wordChar = word.toCharArray();
                char wordToInt = wordChar[0];

                if (wordToInt <= 122 && wordToInt >= 97) {
                    wordToInt = (char) (wordToInt - 32);
                }

                String strippedWord = word.substring(1);
                char[] strippedWordChar = strippedWord.toCharArray();
                String strippedWordFinal = "";
                for (int i = 0; i < strippedWord.length(); i++) {
                    char strippedWordToInt = strippedWordChar[i];

                    if (strippedWordToInt <= 90 && strippedWordToInt >= 65) {
                        strippedWordToInt = (char) (strippedWordToInt + 32);
                    }
                    strippedWordFinal += strippedWordToInt;
                }

                String finishedWord = wordToInt + strippedWordFinal;
                wordFinal = wordFinal + finishedWord + " ";
            }
        }
        System.out.println(wordFinal);
    }
}
