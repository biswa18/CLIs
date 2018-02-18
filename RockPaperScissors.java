
package rockpaperscissors;
import java.util.Scanner;
public class RockPaperScissors {

    public static void main(String[] args) 
    {
        
    Scanner inp=new Scanner(System.in);
    System.out.print("What does Player1 enters between rock, paper & scissors? ");
    String player1=inp.next();
    System.out.print("What does Player2 enters between rock, paper & scissors? ");
    String player2=inp.next();
    if(player1.equals("rock"))
    {
       if(player2.equals("scissors"))
       {
           System.out.println("Player1 Wins!");
       }
       else if(player2.equals("paper"))
       {
           System.out.println("Player2 Wins!");
       }
       else
       {
           System.out.println("Tie!");
       }
    }
    if(player1.equals("paper"))
    {
        if(player2.equals("rock"))
        {
            System.out.println("Player1 wins!");
        }
        else if(player2.equals("scissors"))
        {
            System.out.println("Player2 wins!");
        }
        else
        {
         System.out.println("Tie!");
        }
    }
    if(player1.equals("scissors"))
    {
        if(player2.equals("rock"))
        {
            System.out.println("Player2 Wins!");
        }
        else if(player2.equals("paper"))
        {
            System.out.println("Player1 wins!");
        }
        else
        {
            System.out.println("Tie!");
        }
    }
    }    
}
    
/*if( (player1.equals("rock") && player2.equals("scissors")) || (player1.equals("scissors")&& player2.equals("paper")) || (player1.equals("paper")&& player2.equals("rock")))
        {
            System.out.println("Player1 Wins!");
        }
else if( (player2.equals("rock") && player1.equals("scissors")) || (player2.equals("scissors")&& player1.equals("paper")) || (player2.equals("paper")&& player1.equals("rock")))
        {
            System.out.println("Player2 Wins!");
        }
else
        {
            System.out.println("Tie!");
        }
    }
}*/

 