package org.example;

import java.util.Scanner;

public class InputCheck {

    private Boolean validLetter(String input ) {
        return input.length() == 1 && Character.isLetter(input.charAt(0));
    }

    public Character inputLetter () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву ");
        String character = scanner.nextLine().trim();

        while (!validLetter(character)) {
            System.out.println("Вы ввели строку или некорректный символ! Введите букву ");
            character = scanner.nextLine().trim();
        }
        return Character.toUpperCase(character.charAt(0));
    }
}
