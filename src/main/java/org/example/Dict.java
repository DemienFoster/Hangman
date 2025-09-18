package org.example;

import java.util.*;

public class Dict {
    ArrayList <String> words = new ArrayList<>(List.of("cake", "piece"));

    Map <Character, Integer> word = new TreeMap<>();
    String str = "eee";
    private Map <Character, Integer> filing (Map <Character, Integer> word) {
        for ( int i = 0; i < str.length(); i++ ) {
            word.put(str.charAt(i), i);
        }
        return word;
    }
    public void pr () {
        filing(word);
        System.out.println(word.get('e'));
    }

}
