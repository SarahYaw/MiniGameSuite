package minigames;

import java.util.Scanner;

/*
 * @author SarahYaw
 * https://github.com/SarahYaw
 * just a fun little minigame suite to keep up to snuff on code :)
 */
public class guessmynumber {    
    public static void play()
    {
        System.out.println("-------Welcome to Guess My Number-------");
        int round = 0, score = 0;
        Scanner keyIn = new Scanner(System.in);
        boolean cont=true;
        do {
            System.out.println("Would you like to play again? (y/n)");
            if(keyIn.next().equalsIgnoreCase("n"))
                cont=false;
        }while(cont);
    }
    
}
