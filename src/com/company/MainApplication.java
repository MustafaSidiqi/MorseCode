package com.company;

public class MainApplication {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome - MorseCode");
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();

        while(true) {
            String s[] = textIO.readMorseInput();
            for (String tmp: s) {
                System.out.print(morseLogic.convertToMorse(tmp));
            }
            System.out.println();
        }
    }
}
