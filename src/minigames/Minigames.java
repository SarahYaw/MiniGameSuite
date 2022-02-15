/*
 * @author SarahYaw
 * https://github.com/SarahYaw
 * just a fun little minigame suite to keep up to snuff on code :)
 */
package minigames;

import java.util.Scanner;

public class Minigames {

    
    public static void main(String[] args) {
        //create gui window
        //create gui page for each minigame
        boolean quit=false;
        do {
            System.out.println("""
                               Select a game to play:
                               1 - Rock Paper Scissors
                               2 - High Card Low Card
                               3 - Guess My Number
                               4 - Quit""");
            Scanner keyIn = new Scanner(System.in);
            switch (keyIn.nextLine()) {
                case "1":
                    rockpaperscissors.play();
                    break;
                case "2":
                    highcardlowcard.play();
                    break;
                case "3":
                    guessmynumber.play();
                    break;
                case "4":
                    System.out.println("Goodbye");
                    System.exit(0);
                    quit=true;
                default:
                    System.out.println("Error: Please choose one of the options.");
                    break;
            }
        }while(!quit);
    }
    
}
