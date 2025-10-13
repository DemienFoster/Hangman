package org.example;

import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Game {

    private void endGame(String endGameMessage) {
        System.out.println(endGameMessage);
    }

    private Boolean gameStatusWin(String maskedWord) {
        return !maskedWord.contains(Word.MASKED_SYMBOL.toString());
    }

    private Boolean newGame() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Для начала игры введите: [с]тарт \n" +
                    "Для выхода: [в]ыход ");
            String status = scanner.next().toLowerCase();

            if (status.equals("с") || status.equals("старт")) {
                return true;
            } else if (status.equals("в") || status.equals("выход")) {
                return false;
            }
        }
    }

    private void gamePlay() {
        Word word = new Word();
        InputCheck inputCheck = new InputCheck();
        Hangman hangman = new Hangman();

        Queue<String> hangmanStatus = hangman.initialize();
        String guessedWord = word.selectWord();
        Set<Character> inputLetters = new HashSet<>();

        while (true) {
            Character inputLetter = inputCheck.inputLetter();
            if (inputLetters.contains(inputLetter)) {
                System.out.println("Вы уже ввели эту букву, попробуйте другую");
                continue;
            }
            inputLetters.add(inputLetter);
            String maskedWord = word.printMaskedWord(guessedWord, inputLetters);

            if (guessedWord.contains(String.valueOf(inputLetter))) {
                if (gameStatusWin(maskedWord)) {
                    endGame("Поздравляем!!! Вы выиграли\n\n");
                    break;
                }
            } else {
                System.out.println(hangmanStatus.remove());
                if (hangmanStatus.isEmpty()) {
                    endGame("Вы проиграли ((((\n\n" + "Загаданное слово: " + guessedWord);
                    break;
                }
            }
        }
    }

    public void start() {
        while (newGame()) {
            gamePlay();
        }
    }
}


