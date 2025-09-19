package org.example;

import java.util.Scanner;

public class Game {
    SelectWord selectWord;
    Hangman hangman;
    String status;

    public Game(SelectWord selectWord, Hangman hangman) {
        this.selectWord = selectWord;
        this.hangman = hangman;
    }

    public void play() {
        startOfStop();
        while ()
    }
    public String startOfStop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для начала игры введите: start ");
        System.out.println("Для выхода: q ");
        status = scanner.nextLine();
        scanner.close();
        return status;
    }
}
