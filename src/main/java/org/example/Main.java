package org.example;

import java.io.File;
import java.util.Dictionary;

public class Main
{
    public static void main( String[] args ) {
        /*Game game = new Game();
        game.start();*/
        System.out.println(System.getProperty("user.dir"));

        FileDictionary fd = new FileDictionary();
        //fd.CheckErrorStringsFromFile("Dictionary.txt");
        System.out.println(fd.getSelectWord());
    }
}
