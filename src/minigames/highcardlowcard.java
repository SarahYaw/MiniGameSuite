package minigames;

import java.util.Random;
import java.util.Scanner;

/*
 * @author SarahYaw
 * https://github.com/SarahYaw
 * just a fun little minigame suite to keep up to snuff on code :)
 */
public class highcardlowcard {
    private static final Random random = new Random();
    public static void play()
    {
        System.out.println("-------Welcome to High Card Low Card-------");
        int round = 0, score = 0;
        Scanner keyIn = new Scanner(System.in);
        boolean cont=true, playerPoint;
        do {
            round++;
            //generate number and decide if player wins
            int num = random.nextInt(10)+1, card1 = random.nextInt(10)+1;
            playerPoint = num%2==0;
            //fix score
            if (playerPoint)
                score++;
            //take in user input
            System.out.println("I have drawn two cards from a set 1 through 10.\n" 
                    + "The first card is"+card1+".\n" 
                    + "Do you think the next card is:\n" 
                    + "1 - Higher or 2 - Lower?\n");
            //adapt output to user input and score
            
            int card2;
            if (keyIn.nextLine().equals("1")) {
                if(!playerPoint)
                {
                    do{card2 = random.nextInt(card1)+2;}while(card2>=card1);
                    System.out.println("You chose: Higher\nSorry, the card was "+card2);
                }
                else
                {
                    do{card2 = random.nextInt(8)+2;}while(card2<=card1);
                    System.out.println("You chose: Higher\nCongrats! the card was "+card2);
                }
                System.out.println("Score: "+score+"/"+round+"\n");
            }
            else {
                if (!playerPoint)
                {
                    do{card2 = random.nextInt(8)+2;}while(card2<=card1);
                    System.out.println("You chose: Lower\nSorry, the card was "+card2);
                }
                else
                {
                    do{card2 = random.nextInt(card1)+2;}while(card2>=card1);
                    System.out.println("You chose: Lower\nCongrats! the card was "+card2);
                }
                System.out.println("Score: "+score+"/"+round+"\n");
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
