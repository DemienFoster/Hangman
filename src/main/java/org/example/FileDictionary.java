package org.example;

import java.io.*;
import java.util.regex.Pattern;

public class FileDictionary {

    int lineNumber = 0;

    public void countStringsInFile () {

        try (BufferedReader reader = new BufferedReader(new FileReader("out.txt"))) {


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
