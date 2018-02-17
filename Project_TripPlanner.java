package project_tripplanner;
import java.util.Scanner;
public class Project_TripPlanner 
{
    public static void main(String[] args) 
    {
        greeting();
        timebudget();
        timediff();
        countryarea();
    }
    
    public static void greeting()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Welcome to Trip Planner !");
        System.out.print("What is your name ? ");
        String name=inp.nextLine();
        System.out.print("Nice to meet you "+name+", Where are you travelling to ? ");
        String dest=inp.nextLine();
        System.out.println("Great! "+dest+" sounds like a great trip.");
        System.out.println("*******************\n\n");
    }
    
    public static void timebudget()
    {
        Scanner inp1=new Scanner(System.in);
        System.out.print("How many days are you going to spend Travelling? ");
        int days=inp1.nextInt();
        System.out.print("How much money, in USD, are you planning to spend for this trip? ");
        int amt=inp1.nextInt();
        System.out.print("What is three letter currency symbol for ur travel destination? ");
        String cur=inp1.next();
        System.out.print("How many "+cur+" are there in 1 USD? ");
        int num=inp1.nextInt();
        System.out.println("If you are travelling for "+days+" days that is same as "+(days*24)+" hours or "+(days*24*60)+" minutes.");
        System.out.println("If you'll spend $"+amt+" that means per day u can spend upto $"+(amt/days)+" USD");
        System.out.println("Your total budget in "+cur+" is " +(amt*62)+" which is "+((amt*62)/days)+"Rs. per day");
        System.out.println("*******************\n\n");
    }
    
    public static void timediff()
    {
        Scanner inp2=new Scanner(System.in);
        System.out.print("What is the time diff(in hrs.) between ur home and destination? ");
        int diff=inp2.nextInt();
        System.out.println("Means when it is midnight at home,it will be "+((24+diff)%24)+" at destination place and when it is noon at home it will be "+((12+diff)%24)+" at destination");
        System.out.println("*******************\n\n");
    }
    
    public static void countryarea()
    {
        Scanner inp3=new Scanner(System.in);
        System.out.print("What is the total area of ur destination country in Km2? ");
        double area=inp3.nextDouble();
        System.out.println("In miles2 that is "+(area/1.6)+" miles");
        System.out.println("*******************\n\n");
    }
}
