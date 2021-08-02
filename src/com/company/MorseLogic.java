package com.company;

import java.util.HashMap;
import java.util.Map;

public class MorseLogic {
    private String[] englishArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?"};

    private String[] morseArray = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.." };

    private static final Map<String, String> letterToMorseMap = new HashMap<>();


    private static final Map<String, String> morseToLetterMap = new HashMap<>();

    MorseLogic(){
        for (int i = 0; i < englishArray.length; ++i) {
            letterToMorseMap.put(englishArray[i], morseArray[i]);
        }

        for (int i = 0; i < englishArray.length; ++i) {
            morseToLetterMap.put(morseArray[i], englishArray[i]);
        }
    }

    public String convertToText(String ch){
        return morseToLetterMap.get(ch);
    }
}
