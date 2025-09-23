package org.example;

import java.util.Scanner;

public class InputCheck {
    Scanner scanner = new Scanner(System.in);

    private Boolean checkValidLetter (String input ) {
        if (input.length() != 1 || !(Character.isLetter(input.charAt(0)))) {
            System.out.println("Введите букву ");
            return false;
        }
        return true;
    }

    public Character inputLetter () {
        System.out.println("Введите букву ");
        String character = scanner.next();

        while (!checkValidLetter(character)) {
            character = scanner.next();
        }
        return Character.toUpperCase(character.charAt(0));
    }


}
