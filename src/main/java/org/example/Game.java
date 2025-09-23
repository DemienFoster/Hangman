package org.example;

import java.util.Scanner;

public class Game {
    SelectWord selectWord;
    Hangman hangman;
    InputCheck inputCheck;
    String status;


    public Game(SelectWord selectWord, Hangman hangman, InputCheck inputCheck) {
        this.selectWord = selectWord;
        this.hangman = hangman;
        this.inputCheck = inputCheck;
    }

    private Boolean start() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для начала игры введите: [s]tart \n" +
                           "Для выхода: [q]uit ");
        status = scanner.next();

        while (true) {
            if (status.equals("s") || status.equals("start")) {
                return true;
            } else if (status.equals("q") || status.equals("quit")) {
                break;
            }
        }
        return false;
    }

    public void play () {
        while (start()) {
            hangman.initialize();

        }
    }
}
