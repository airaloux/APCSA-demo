
/**
 * A basic cycling computer
 *
 * @author Annie
 * @version 8/15/18
 */

import java.util.Scanner;

public class CyclingComputer
{
   public static void main(String [] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("How many miles have you ridden already?");
       double miles_ridden = input.nextDouble();
       
       System.out.println("How many hours have you been riding?");
       double time_ridden = input.nextDouble();
       double avg_speed =  miles_ridden / time_ridden;
       System.out.println("Your average speed is " + avg_speed + " mph.");
       
       System.out.println("what average speed would you like to achieve today?");
       double avg_speed_goal = input.nextDouble();
       
       System.out.println("How many more miles do you plan on riding today?");
       double miles_planned = input.nextDouble();
       
       double necessary_time = ((miles_ridden + miles_planned)/avg_speed_goal) - time_ridden;
       System.out.println(necessary_time);
       double necessary_avg = miles_planned / necessary_time;
     
       System.out.println("To reach your desired average speed of " + avg_speed_goal + " mph, you will need an average speed of " + necessary_avg + "for the remainder of your cycling trip.");

       double x = (int)((Math.random() * 10 + 1));
       System.out.println(x);
       
       double y = (int)(Math.random() *20 + 1);
       System.out.println(y);
       
       //doublex
       

       
       
       
       
       
       
       
       
       

   }
}
