package start;

import levels.Level1;

import java.util.Scanner;

/**
 * Created by bradleyturek on 6/16/17.
 */
public class TextBasedGame1 {

    /**
     * This is  how we get user input.
     */
    public static Scanner keyboard = new Scanner(System.in);

    /**
     * What the player calls zimself.
     */
    public static String name;

    public static void main(String[] args) {
        println("Hello. Welcome.");

        print("Please enter your name: ");
        name = keyboard.next();

        println("Hello, " + name + ".");
        println("Welcome to the game.");

        Level1.start();

        println("\nThat's all the levels for now, thanks for playing!");
    }


    /**
     * A convenient way to access System.out.println(...);
     * @param string
     */
    public static void println(String string) {
        System.out.println(string);
    }

    /**
     * A convenient way to access System.out.print(...);
     * @param string
     */
    public static void print(String string) {
        System.out.print(string);
    }
}