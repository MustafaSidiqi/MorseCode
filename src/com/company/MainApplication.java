package com.company;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome - MorseCode");
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("|   MENU SELECTION              |");
            System.out.println("| Options:                      |");
            System.out.println("|        0. Exit                |");
            System.out.println("|        1. Convert to morse    |");
            System.out.println("|        2. Convert to text     |");
            System.out.println("Select option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    String[] s = textIO.readMorseInput();
                    for (String tmp: s) {
                        System.out.print(morseLogic.convertToMorse(tmp));
                    }
                    System.out.println();
                    break;
                case 2:
                    String[] s2 = textIO.readMorseInput();
                    for (String tmp: s2) {
                        System.out.print(morseLogic.convertToText(tmp));
                    }
                    System.out.println();
                    break;
                default:
                    // The user input an unexpected choice
                    break;
            }
        }
    }
}
