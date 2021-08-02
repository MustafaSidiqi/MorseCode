package com.company;

public class MainApplication {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome - MorseCode");
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String s[] = textIO.readUserInput();

        for (String tmp: s) {
            System.out.println(morseLogic.convertToText(tmp));
        }
        //textIO.readUserInput();


    }
}
