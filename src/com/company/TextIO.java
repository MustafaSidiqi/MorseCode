package com.company;

import java.util.Scanner;

public class TextIO {
    public TextIO() {
    }

    public String[] readUserInput(){
        Scanner input = new Scanner(System.in);
        String s[] = input.nextLine().split(" ");
        input.close();
        return s;
    }
}
