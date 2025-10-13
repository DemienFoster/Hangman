package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputCheck {
    private static final Pattern VALID_PATTERN = Pattern.compile("[А-Яа-яЁё]");

    private Boolean validLetter(String input) {
        return input.length() == 1 && VALID_PATTERN.matcher(input).matches();
    }

    public Character inputLetter() {
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
