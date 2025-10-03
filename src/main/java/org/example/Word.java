package org.example;

import java.util.*;

public class Word {
    private final ArrayList<String> words = new ArrayList<>(List.of("piece"));
    Map<Character, ArrayList<Integer>> characterIndexesInWord = new HashMap<>();

    String maskedWord;

    public String selectWord () {
        String word = words.get(new Random().nextInt(words.size())).toUpperCase();
        maskedWord = String.valueOf('_').repeat(word.length());
        setCharacterIndexesInWord(word);
        return word;
    }

    private void setCharacterIndexesInWord( String word) {
        for (int i = 0; i < word.length(); i++) {
            characterIndexesInWord.computeIfAbsent(word.charAt(i), v -> new ArrayList<>()).add(i);
        }
        System.out.println(characterIndexesInWord);
    }

    public Boolean letterPresentInWord (Character inputLetter) {
        return characterIndexesInWord.containsKey(inputLetter);
    }

    public String printMaskedWord(String word, Set<Character> set) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if(set.contains(word.charAt(i))) {
                stringBuilder.append(word.charAt(i));
            } else
                stringBuilder.append('_');
        }
        System.out.println("----------------------");
        System.out.println(stringBuilder.toString());
        System.out.println("----------------------");
        return stringBuilder.toString();
    }


}


