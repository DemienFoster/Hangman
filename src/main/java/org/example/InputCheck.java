package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InputCheck {

    private Set<Character> input = new HashSet<>();

    private Boolean checkValidLetter (String input ) {
        if (input.length() != 1 || !(Character.isLetter(input.charAt(0)))) {
            System.out.println("Введите букву ");
            return false;
        }
        return true;
    }

    public Character inputLetter () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву ");
        String character = scanner.next();

        while (!checkValidLetter(character)) {
            character = scanner.next();
        }
        return Character.toUpperCase(character.charAt(0));
    }

    /*public void startInput() {
        while (true) {
            if()
            input.add(inputLetter());
        }
    }*/

}
