package minigames;

import java.util.Random;
import java.util.Scanner;

/*
 * @author SarahYaw
 * https://github.com/SarahYaw
 * weird way of doing rock paper scissors
 */
public class rockpaperscissors {
    private static final Random random = new Random();
    public static void play()
    {
        System.out.println("-------Welcome to Rock Paper Scissors-------");
        int round = 0, score = 0;
        Scanner keyIn = new Scanner(System.in);
        boolean cont=true, playerPoint;
        do {
            round++;
            //generate number and decide if player wins
            int num = random.nextInt(11)+1;
            playerPoint = num%2==0;
            //fix score
            if (playerPoint)
                score++;
            //take in user input
            System.out.println("Choose:\n" + "1 - Rock\n" + "2 - Paper\n" + "3 - Scissors");
            //adapt output to user input and score
            switch (keyIn.nextLine()) {
                case "1" -> {
                    if(!playerPoint)
                        System.out.println("You chose: Rock\nComputer chose: Paper\nComputer wins");
                    else
                        System.out.println("You chose: Rock\nComputer chose: Scissors\nYou win!");
                    System.out.println("Score: "+score+"/"+round+"\n");
                }
                case "2" -> {
                    if (!playerPoint)
                        System.out.println("You chose: Paper\nComputer chose: Scissors\nComputer wins");
                    else
                        System.out.println("You chose: Paper\nComputer chose: Rock\nYou win!");
                    System.out.println("Score: "+score+"/"+round+"\n");
                }
                case "3" -> {
                    if (!playerPoint)
                        System.out.println("You chose: Scissors\nComputer chose: Rock\nComputer wins");
                    else
                        System.out.println("You chose: Scissors\nComputer chose: Paper\nYou win!");
                    System.out.println("Score: "+score+"/"+round+"\n");
                }
                default -> System.out.println("Error");
            }
            //play again loop
            System.out.println("Would you like to play again? (y/n)");
            if(keyIn.next().equalsIgnoreCase("n"))
                cont=false;
            keyIn.nextLine();
        }while(cont);
        System.out.println("--------------------------------------------");
    }
    
}
