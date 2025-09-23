package org.example;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main
{
    public static void main( String[] args ) {
        Game game = new Game(new SelectWord(), new Hangman(), new InputCheck());
        game.play();

    }
}
