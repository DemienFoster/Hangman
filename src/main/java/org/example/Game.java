package org.example;

import java.util.*;

public class Game {

   private void newGameOrQuit() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для начала игры введите: [s]tart \n" +
                           "Для выхода: [q]uit ");

        String status = scanner.next();

        while (true) {
            if (status.equals("s") || status.equals("start")) {
                play();
            } else if (status.equals("q") || status.equals("quit")) {
                break;
            }
        }
    }

    private void endGame (String endGameMessage ) {
        System.out.println(endGameMessage);
    }
    private Boolean gameStatusWin(String maskedWord) {
        return !maskedWord.contains("_");
    }

    public void play () {
        Word word = new Word();
        InputCheck inputCheck = new InputCheck();
        Hangman hangman = new Hangman();

        Queue<String> hangmanStatus = hangman.initialize();
        String guessedWord = word.selectWord();
        Set<Character> inputLetters = new HashSet<>();

        while (true) {
            Character inputLetter = inputCheck.inputLetter();
            if (inputLetters.contains(inputLetter)) {
                System.out.println("You already input this letter, try another");
                continue;
            }
            inputLetters.add(inputLetter);

            if (guessedWord.contains(String.valueOf(inputLetter))) {
                String maskedWord = word.printMaskedWord(guessedWord, inputLetters);
                if(gameStatusWin(maskedWord)) {
                    endGame("Поздравляем!!! Вы выиграли");
                    newGameOrQuit();
                }
            } else {
                System.out.println(hangmanStatus.remove());
                if (hangmanStatus.isEmpty()) {
                    endGame("Вы проиграли ((((");
                    newGameOrQuit();
                }
            }
        }


    }
}


