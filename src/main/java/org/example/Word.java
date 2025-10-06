package org.example;

import java.util.*;

public class Word {
    private final ArrayList<String> words = new ArrayList<>(List.of("Piece"));
    private final Map<Character, ArrayList<Integer>> characterIndexesInWord = new HashMap<>();

    private void setCharacterIndexesInWord( String word) {
        for (int i = 0; i < word.length(); i++) {
            characterIndexesInWord.computeIfAbsent(word.charAt(i), v -> new ArrayList<>()).add(i);
        }
        System.out.println(characterIndexesInWord);
    }

    public String selectWord () {
        String word = words.get(new Random().nextInt(words.size())).toUpperCase();
        setCharacterIndexesInWord(word);
        return word;
    }

    public String printMaskedWord(String word, Set<Character> setOfLetters) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if(setOfLetters.contains(word.charAt(i))) {
                stringBuilder.append(word.charAt(i));
            } else
                stringBuilder.append('_');
        }
        String outputStr = stringBuilder.toString();
        System.out.println("----------------------");
        System.out.println("\t\t" + outputStr);
        System.out.println("----------------------");
        return outputStr;
    }


}


