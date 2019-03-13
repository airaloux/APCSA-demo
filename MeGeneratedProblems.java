
/**
 * Write a description of class MeGeneratedProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MeGeneratedProblems
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        //create a program that takes in prices of different meals and turns them into an array. Then print all the values but + a 15% tax
        System.out.println("How many items are there?");
        int numitems = kb.nextInt();
        double [] array = new double[numitems];
        for (int i = 0; i < numitems; i++)
        {
            System.out.println("Print the price of item # " + (i+ 1) + ": "); 
            double price = kb.nextDouble();
            array[i] = price + price * .15;
            
            
        }
        
        for (int i = 0; i < numitems; i++)
        {
            System.out.println(array[i]);
        }
    }
    
}
