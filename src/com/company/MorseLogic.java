package com.company;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MorseLogic {
    private String[] letterArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?", " "};

    private String[] morseArray = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--..", "/" };

    private static final Map<String, String> completeMap = new HashMap<>();

    MorseLogic(){
        for (int i = 0; i < letterArray.length; ++i) {
            completeMap.put(letterArray[i], morseArray[i]);
        }

        for (int i = 0; i < letterArray.length; ++i) {
            completeMap.put(morseArray[i], letterArray[i]);
        }
    }

    public String getItem(String key) {
        if(key != null && key.length() > 0 && completeMap.containsKey(key)){
            return completeMap.get(key);
        }
        return "invalid key";
    }

    public String convertToText(String str){
        if(str != null && str.length() > 0){
            str.toLowerCase();
            String result = "";
            String arrSplit[] = str.split(" ");
            for (String tmp: arrSplit) {
                result += (getItem(tmp));
            }
            return result;
        }
        return "invalid input";
    }

    public String convertToMorse(String str) {
        if(str != null && str.length() > 0){
            str = str.toLowerCase();
            String result = "";
            char[] chars = str.toCharArray();
            for (char ch: chars) {
                result += (getItem(Character.toString(ch))) + " ";
            }
            return result.substring(0,result.length() - 1);
        }
        return "invalid input";
    }
}
