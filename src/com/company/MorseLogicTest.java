package com.company;

import static org.junit.jupiter.api.Assertions.*;

class MorseLogicTest {

    @org.junit.jupiter.api.Test
    void MorseToLetter1() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String result = morseLogic.convertToText("--");
        String actual = "m";
        assertEquals(result, actual);
    }

    @org.junit.jupiter.api.Test
    void MorseToLetter2() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String result = morseLogic.convertToText("... --- ...");
        String actual = "sos";
        assertEquals(result, actual);
    }

    @org.junit.jupiter.api.Test
    void MorseToLetter3() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String result = morseLogic.convertToText("-- . .- -. .. -. --. / --- ..-. / .-.. .. ..-. .");
        String actual = "meaning of life";
        assertEquals(result, actual);
    }

    @org.junit.jupiter.api.Test
    void MorseToLetter4() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String result = morseLogic.convertToText("....- ..---");
        String actual = "42";
        assertEquals(result, actual);
    }

    @org.junit.jupiter.api.Test
    void MorseToLetter5() {

    }

    @org.junit.jupiter.api.Test
    void MorseToLetterNull() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String result = morseLogic.convertToText("------....");
        String actual = "invalid key";
        assertEquals(result, actual);
    }

    @org.junit.jupiter.api.Test
    void LetterToMorse1() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String result = morseLogic.convertToMorse("morse code");
        String actual = "-- --- .-. ... . / -.-. --- -.. .";
        assertEquals(result, actual);
    }

    @org.junit.jupiter.api.Test
    void LetterToMorse2() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String result = morseLogic.convertToMorse("ASAS");
        String actual = ".- ... .- ...";
        assertEquals(result, actual);
    }

    @org.junit.jupiter.api.Test
    void LetterToMorse3() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String result = morseLogic.convertToMorse("@(&%¤1");
        String actual = "invalid key invalid key invalid key invalid key invalid key .----";
        assertEquals(result, actual);
    }

    @org.junit.jupiter.api.Test
    void LetterToMorseNull() {
        TextIO textIO = new TextIO();
        MorseLogic morseLogic = new MorseLogic();
        String result = morseLogic.convertToMorse("øøe");
        String actual = "invalid key invalid key .";
        assertEquals(result, actual);
    }



}