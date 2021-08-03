package com.company;

import java.util.Scanner;

public class TextIO {
    Scanner input = new Scanner(System.in);

    public TextIO() {
    }

    public String[] readMorseInput(){
        String s[] = input.nextLine().split(" ");
        return s;
    }

    public String readtextInput(){
        String s = input.nextLine();
        return s;
    }

    public void closeReader(){
        input.close();
    }
}
