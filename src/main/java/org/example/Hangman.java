package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Hangman {
    private final String tree = " ---------|\n" +
            "  |       |\n" +
            "          |\n" +
            "          |\n" +
            "          |\n" +
            "         _|_";


    private final String head = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n";
    private final String body = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n" +
            "  |       |\n" +
            "          |\n" +
            "         _|_";
    private final String lHand = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n" +
            "/ |       |\n" +
            "          |\n" +
            "         _|_";
    private final String rHand = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n" +
            "/ | \\     |\n" +
            "          |\n" +
            "         _|_";
    private final String lLeg = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n" +
            "/ | \\     |\n" +
            " /        |\n" +
            "         _|_";
    private final String rLeg = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n" +
            "/ | \\     |\n" +
            " / \\      |\n" +
            "         _|_";
    public Queue <String> initialize() {
        return new LinkedList<>(List.of(tree, head, body, lHand, rHand, lLeg, rLeg));
    }
}
