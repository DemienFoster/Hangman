package org.example;

import java.io.*;
import java.util.regex.Pattern;

public class FileDictionary {

    /*
     * Тут есть два метода и константа, которые я использовал для валидации файла словаря,
     * которые в программе не используются, но будут полезны в дальнейшем, поэтому решил пока их не удалять:
     *
     * final Pattern VALID_PATTERN
     *
     * isLineValid()
     * CheckErrorStringsFromFile()
     *
     * В чем суть. Файл словаря я скачал из сети. Когда начал просматривать глазами
     * оказалось, что там есть не валидные строки.
     *
     * В итоге был реализован функционал, который удалял эти строки:
     * - строки в которых есть символы отличные от букв
     * - убирает слова, в которых меньше
     * - и строки в которых больше одного слова
     *
     * На существительные в именительном падеже их конечно не проверить - в файле около 60 000 строк, но
     * то что сделано, считаю хорошим функционалом и в дальнейшем его можно будет прикрутить, если пользователь
     * захочет добавлять свой словарь вместо моего. Удалять пока не буду.
     *
     *
     * */

    private static final Pattern VALID_PATTERN = Pattern.compile("[А-Яа-яЁё]+");

    private Boolean isLineValid (String line) {
        if(line.isEmpty()) {
            return false;
        }
        String trimmedLine = line.trim();
        String[] words = trimmedLine.split("\\s+");
        if(words.length != 1 || words[0].length() < 5) {
            return false;
        }
        return VALID_PATTERN.matcher(trimmedLine).matches();
    }

    public void CheckErrorStringsFromFile (String dictionary) {
        int lineNumber = 0;
        int brokenLines = 0;
        int validLinesCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(dictionary));
             BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                lineNumber++;

                if(isLineValid(line)) {
                    writer.write(line);
                    writer.newLine();
                    validLinesCount++;
                } else {
                    System.out.println("Строка № " + lineNumber + ": \"" + line + "\" !Некорректная" );
                    brokenLines++;
                }
            }
            System.out.println("---------------------\n\n");
            System.out.println("Всего строк: " + lineNumber);
            System.out.println("Битых строк: " + brokenLines);
            System.out.println("Валидных: " + validLinesCount);
            System.out.println("\n\n-----------------------");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void countStringsInFile () {

        try (BufferedReader reader = new BufferedReader(new FileReader("out.txt"))) {
            int lineNumber = 0;

            while (reader.readLine() != null) {
                lineNumber++;
            }
            System.out.println("---------------------\n\n");
            System.out.println("Всего строк: " + lineNumber);
            System.out.println("\n\n-----------------------");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
