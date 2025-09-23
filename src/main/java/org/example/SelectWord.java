package org.example;

import java.util.*;

public class SelectWord {
    private final ArrayList <String> words = new ArrayList<>(List.of("cake", "piece"));
    public String select () {
        return words.get(new Random().nextInt(words.size()));
    }
}


