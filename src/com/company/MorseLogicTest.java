package com.company;

import static org.junit.jupiter.api.Assertions.*;

class MorseLogicTest {

    @org.junit.jupiter.api.Test
    void MorseToLetter1() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String expected = morseLogic.convertToText("--");
        String actual = "m";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void MorseToLetter2() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String expected = morseLogic.convertToText("... --- ...");
        String actual = "sos";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void MorseToLetter3() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String expected = morseLogic.convertToText("-- . .- -. .. -. --. / --- ..-. / .-.. .. ..-. .");
        String actual = "meaning of life";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void MorseToLetter4() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String expected = morseLogic.convertToText("....- ..---");
        String actual = "42";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void MorseToLetterNull() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String expected = morseLogic.convertToText("------....");
        assertEquals(expected, null);
    }

    @org.junit.jupiter.api.Test
    void LetterToMorse1() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String expected = morseLogic.convertToMorse("morse code");
        String actual = "-- --- .-. ... . / -.-. --- -.. .";
        assertEquals(expected, actual);
    }


}