package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Hangman {
    String all = " ---------|\n" +
            "  |       |\n" +
            "          |\n" +
            "          |\n" +
            "          |\n" +
            "         _|_";


    String head = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n";
    String body = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n" +
            "  |       |\n" +
            "          |\n" +
            "         _|_";
    String lHand = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n" +
            "/ |       |\n" +
            "          |\n" +
            "         _|_";
    String rHand = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n" +
            "/ | \\     |\n" +
            "          |\n" +
            "         _|_";
    String lLeg = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n" +
            "/ | \\     |\n" +
            " /        |\n" +
            "         _|_";
    String rLeg = " ---------|\n" +
            "  |       |\n" +
            "  O       |\n" +
            "/ | \\     |\n" +
            " / \\      |\n" +
            "         _|_";
    Queue <String> play = new LinkedList<>(List.of(all, body, lHand, rHand, lLeg, rLeg));


}
