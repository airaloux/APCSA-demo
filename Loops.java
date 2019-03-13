
/**
 * An introduction to loops
 *
 * @author Annie Radillo
 * @version 8/30
 */
import java.util.Scanner;
public class Loops

{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        // // int x = 1;
    
        // // while (x < 10)
        // // {
            // // System.out.println("uh oh");
            // // x++;
    
        // // }
        // // System.out.println(x); //prints 10
        
        // System.out.println("Guess a number between one and 10: ");
        
        // int num = (int)(Math.random()*10 +1);
        // int guess = kb.nextInt();
        // int xguessed = 0;
        // int oldguess = 0;
        
        
        // while (guess != num)
        // {
            // if (guess < num)
            // {
                // System.out.println("Your number is too low, guess again:");
                
                // guess = kb.nextInt();

            // }
            
            // else if (guess > num)
            // {
                // System.out.println("Your number is too high, guess again:");
                // guess = kb.nextInt();
            // }
            // xguessed++;
        // }
        
        
        // if (xguessed >= 2)
            // {
                // System.out.println("Took you long enough! (yes, you finally guessed it)");
            // }
        // else if (xguessed < 2)
            // {
                // System.out.println("Nice job! You have guessed the number!");
            // }
        
        
        /*
         * 
         */
        
        //do while loops ensure that while loop is passed through at least once
        
        // int z;
        // do
        // {
            // System.out.println("enter a number that is less than 3:");
            // z =- kb.nextInt(0);
            
        // } while (z >= 3);
        
        //for loops
        
        // for (int i = 0; i < 10; i++)
        // {
            // System.out.println(i + ". Annie");
        // }
        
        // for (int i = 40; i >= 20; i--)
        // {
            // System.out.println("Loop#" + i);
        // }
        
        //counts from 1 to 100
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(i);
        }
        
        //counts from 100 to 1
        for (int i = 100; i >= 1; i--)
        {
            System.out.println(-(i - 101));
            
        }
        
        for (int i = 100; i <= 10000; i = i + 100)
        {
            System.out.println(i / 100);
        }
        
        for (int i = 100; i <= 199; i++)
        {
            System.out.println(i - 99);
        }
        
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        for (int i = 0; i < 100000; i++)
        {
            int someRando = (int)(Math.random() * 5 + 1);
            switch (someRando)
            {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four ++;
                    break;
                case 5:
                    five++;
                    break;
                default:
                    System.out.println("errr");
            }
            // System.out.println(someRando);
            
        }
        System.out.println("1:" + one);
        System.out.println("2:" + two);
        System.out.println("3:" + three);
        System.out.println("4:" + four);
        System.out.println("5:" + five);
   
    
    }
}
