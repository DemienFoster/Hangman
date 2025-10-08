package org.example;

import java.io.*;
import java.util.Random;
import java.util.regex.Pattern;

public class FileDictionary {

    private final int NUMBER_OF_LINES = 48777;
    private String selectWord;

    public String getSelectWord () {
        try (BufferedReader reader = new BufferedReader(new FileReader("out.txt"))) {
            String selectWord;
            int lineNumber = 0;
            int randomLineNumber = new Random().nextInt(NUMBER_OF_LINES);
            while ((selectWord = reader.readLine()) != null) {
                lineNumber++;
                if(lineNumber == randomLineNumber) {
                    return selectWord;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
