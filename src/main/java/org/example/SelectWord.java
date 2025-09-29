package org.example;

import java.util.*;

public class SelectWord {
    private final ArrayList <String> words = new ArrayList<>(List.of("piece"));
    public  Map <Character, ArrayList<Integer>> select () {
        String word = words.get(new Random().nextInt(words.size())).toUpperCase();
        Map <Character, ArrayList<Integer>> characterPlaceInWord = new HashMap<>();
        for (int i = 0; i < word.length(); i++){
            characterPlaceInWord.computeIfAbsent(word.charAt(i), v -> new ArrayList<>()).add(i);
        }

        System.out.println(characterPlaceInWord);
        return characterPlaceInWord;
    }


}


