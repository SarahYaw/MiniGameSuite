/*
 * @author SarahYaw
 * https://github.com/SarahYaw
 * I read a post online a few months back about how someone had an unusal 
 * approach to these classic school problems with number generation and I 
 * wanted to try it myself. Instead of the computer generating a number and 
 * choosing between the plays (for rock paper scissors, for example), they 
 * had the computer generate and choose if it won or lost and chose a play 
 * based on that. The code is going to be longer and slightly more complicated 
 * that way, but it changes the odds of the user winning a lot. I want to 
 * see how many problems I can approach with that kind of logic. It's not 
 * necessarily efficient or anything, but it is interesting :)
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
