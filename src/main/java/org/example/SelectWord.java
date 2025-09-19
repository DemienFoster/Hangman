package org.example;

import java.util.*;

public class SelectWord {
    ArrayList <String> words = new ArrayList<>(List.of("cake", "piece"));
    String str = words.get(new Random().nextInt(words.size()));
    Map <Character, ArrayList<Integer>> word = new HashMap<>();

    public  Map <Character, ArrayList<Integer>> fil () {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            word.computeIfAbsent(ch, k -> new ArrayList<>()).add(i);
        }
    return word;
    }

}


