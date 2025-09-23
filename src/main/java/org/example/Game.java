package org.example;

import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Game {
    SelectWord selectWord;
    Hangman hangman;
    String status;
    Scanner scanner = new Scanner(System.in);
    char letter;
    public Game(SelectWord selectWord, Hangman hangman) {
        this.selectWord = selectWord;
        this.hangman = hangman;
    }
    private Boolean checkValidLetter (String input ) {
        if (input.length() != 1 || !(Character.isLetter(input.charAt(0)))) {
            System.out.println("Введите букву ");
            return false;
        }
        return true;
    }

    private Character inputLetter () {
        System.out.println("Введите букву ");
        String character = scanner.next();
        while (!checkValidLetter(character)) {
            character = scanner.next();
        }
        return Character.toUpperCase(character.charAt(0));
    }


    private String playStatus() {
        System.out.println("Для начала игры введите: [s]tart \n" +
                           "Для выхода: [q]uit ");
        status = scanner.next();
        return status;
    }

    public void play () {
        while (true) {
            playStatus();
            if (status.equals("s") || status.equals("start")) {
                Set<Character> inputLetters = new HashSet<>();
                String guessedWord = selectWord.select();
                String masked = "_ ".repeat(guessedWord.length());
                System.out.println(masked);
                Queue<String> errorStages = hangman.initialize();
                if(inputLetters.contains(inputLetter())) {
                    System.out.println("It letter have already been, try another");
                } else {
                    inputLetters.add(inputLetter());

                    System.out.println();

                }


            } else if (status.equals("q") || status.equals("quit")) {
                break;
            }
        }
    }
}
