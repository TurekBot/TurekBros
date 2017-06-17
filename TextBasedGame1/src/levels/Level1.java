package levels;

import javafx.animation.AnimationTimer;

import java.util.Timer;
import java.util.TimerTask;

import static start.TextBasedGame1.*;


/**
 * Created by bradleyturek on 6/16/17.
 */
public class Level1 {
    public static void start() {
        println("\nLEVEL 1\n");

        println("Here's your first question: ");

        boolean firstTime = true;

        do {
            if (!firstTime) {
                print("No, no, c'mon: ");
            }
            print("Cody is a ");
            firstTime = false;

        } while (!keyboard.next().equals("noob"));


        println("That's right!! You did it!");
        println("\nLEVEL 1 Complete.\n");
    }
}
