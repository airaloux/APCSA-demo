
/**
 * Write a description of class ConditionalStatements here.
 *
 * @author Annie Radillo
 * @version 8/24
 */
import java.util.Scanner;
public class ConditionalStatements

{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner (System.in);
        // System.out.println("enter a one or a two");
        // int num = kb.nextInt();
        
        // if (num == 1)
        // {System.out.println("you entered a one");
         
            
       
        // }
        // else if (num == 2)
        // {
            // System.out.println("you entered a two! way to go!");
        // }
        // else 
        // {
            // System.out.println("you didnt enter a one or two");
        // }
        
        // System.out.println("thanks for playing!");
        
        // System.out.println("enter the number of points you have earned");
        // int PointsGot = kb.nextInt();
        
        // System.out.println("enter the number of possible points");
        // int pointsPossible = kb.nextInt();
        
        // double average = 100 * (double)PointsGot / pointsPossible;
        
        // System.out.println("your average is" + average + "%");
        
        // String grade;
        // if (average >= 90)
        // grade = "A";                 
        // else if (average >= 80 && average < 90)       
        // grade = "B";        
        // else if (average >= 70 && average < 80)
        // grade = "C";
        // else if (average >= 60 && average <70)
        // grade = "D";
        // else 
        // grade = "F";
        
        // System.out.println("your grade is" + grade + ".");
        
        int randomNumber = (int)(Math.random() * 10) + 1;
        System.out.println(randomNumber);

        System.out.println("guess a number!");
        int guess = kb.nextInt();
        
        if (guess == randomNumber)
        System.out.println("you guessed it!");
        else if (guess != randomNumber)
        System.out.println("sorry, youve failed!");
        
        int x = 5;
        int y = 10;
        int z = 100;
        
        if (x > 0 && y>5)
        System.out.println("hi");
       
       
    }
}
