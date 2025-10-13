package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class FileDictionary {

    private final int NUMBER_OF_LINES = 48777;
    private final String dictionaryFile = "Dictionary.txt";
    private final String githubAddress = "https://github.com/DemienFoster/Hangman";

    private void fileError(String error) {
        System.out.println( error + dictionaryFile + "\n" +
                 "Скачайте актуальную версию файла " + dictionaryFile + " в корень программы по адресу: " + githubAddress);
        System.exit(0);
    }

    public String getSelectWord() {
        String selectWord = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(dictionaryFile))) {
            int lineNumber = 0;
            int randomLineNumber = new Random().nextInt(NUMBER_OF_LINES);
            while ((selectWord = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber == randomLineNumber) {
                    return selectWord;
                }
            }
        } catch (FileNotFoundException e) {
            fileError("❌ Файл не найден: ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (selectWord == null) {
            fileError("❌ Файл повреждён или изменён: ");
        }
        return selectWord;
    }
}
