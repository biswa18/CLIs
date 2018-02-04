package oddevenproject;
import java.util.*;
public class OddEvenProject 
{
   public static void main(String[] args) 
    {
        System.out.println("Lets play a game, \"Odd and Evens\"");
        System.out.print("What is your name? ");
        Scanner inp=new Scanner(System.in);
        String nm=inp.next();
        
        //The picking stage begins here
        
        System.out.print("Hello "+nm+" which do you choose? (O)dds or (E)vens? ");
        String opt=inp.next();
        if(opt.equalsIgnoreCase("O"))
        {
            System.out.println(nm+" has picked odds,computer will be evens!");
        }
        else if(opt.equalsIgnoreCase("E"))
        {
            System.out.println(nm+" has picked evens,computer will be odds!");
        }
        else
        {
            System.out.println("Wrong input,choose between E & O only.");
            return;
        }        
        System.out.println("*********************");
        
        //Taking inputs from User and Computer of Fingers to be played
        
        System.out.print("How many fingers you want to use? ");
        int num=inp.nextInt();
        Random rand = new Random();
        int comp = rand.nextInt(6);
        System.out.println("The Computer plays with "+comp+" fingers.");
        System.out.println("*********************");
        
        // Calculation part begins here
        
        int sum=num+comp;
        System.out.println(num+" + "+comp+" = "+sum);
        if(sum%2==0)
        {
            System.out.println(sum+" is even.");
        }
        else
        {
            System.out.println(sum+ " is odd.");
        }
        
        // Deciding the winner
        
        if(sum%2==0)  //checking if sum is even
        {
            if(opt.equalsIgnoreCase("E"))
            {
                System.out.println("That means "+nm+ " wins! :)");
            }
            else
            {
                System.out.println("That means computer wins! :)");
            }
        }
        else   //checks for sum is odd
        {
            if(opt.equalsIgnoreCase("O"))
            {
                System.out.println("That means "+nm+ " wins! :)");
            }
            else
            {
                System.out.println("That means computer wins! :)");
            }
        }
    }
      
}
