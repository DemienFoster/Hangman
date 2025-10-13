package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Word {
    public static final Character MASKED_SYMBOL = '_';

    private final Map<Character, ArrayList<Integer>> characterIndexesInWord = new HashMap<>();
    private final FileDictionary fileDictionary = new FileDictionary();

    private void setCharacterPlaceInWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            characterIndexesInWord.computeIfAbsent(word.charAt(i), v -> new ArrayList<>()).add(i);
        }
    }

    public String selectWord() {
        String word = fileDictionary.getSelectWord().toUpperCase();
        setCharacterPlaceInWord(word);
        return word;
    }

    public String printMaskedWord(String word, Set<Character> setOfLetters) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (setOfLetters.contains(word.charAt(i))) {
                stringBuilder.append(word.charAt(i));
            } else
                stringBuilder.append(MASKED_SYMBOL);
        }
        String outputStr = stringBuilder.toString();
        System.out.println("----------------------");
        System.out.println("\t\t" + outputStr);
        System.out.println("----------------------");
        return outputStr;
    }
}


