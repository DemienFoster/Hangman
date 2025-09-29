package org.example;

import java.util.*;

public class Game {
    SelectWord selectWord;
    InputCheck inputCheck;
    String status;

    public Game(SelectWord selectWord, InputCheck inputCheck) {
        this.selectWord = selectWord;
        this.inputCheck = inputCheck;
    }

    private void start() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для начала игры введите: [s]tart \n" +
                           "Для выхода: [q]uit ");
        status = scanner.next();

        while (true) {
            if (status.equals("s") || status.equals("start")) {
                play();
            } else if (status.equals("q") || status.equals("quit")) {
                break;
            }
        }
    }
    private void endGame (String message) {
        System.out.println(message);
    }

    public void play () {
            Hangman hangman = new Hangman();
            Queue<String> hangmanStatus = hangman.initialize();
            Map<Character, ArrayList<Integer>> guessWordCharacters = selectWord.select();
            Set<Character> userInput = new HashSet<>();
            while () {
                Character inputLetter = inputCheck.inputLetter();
                userInput.add(inputLetter);

                }
        }
    }
}
