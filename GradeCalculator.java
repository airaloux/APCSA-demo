
/**
 * Calculates points needed to get an A, B, C, or D
 *
 * @author Annie Radillo
 * @version 8/15/18
 */
import java.util.Scanner;
public class GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Hello, and welcome to Grade Calculator.");
        System.out.print("How many points have you earned thus far?");
        
        int points_earned = kboard.nextInt(); 
        
        System.out.println("How many points have been available to you thus far?");
        int points_available = kboard.nextInt();
        
        double current_average = (double)points_earned/points_available;
        System.out.println("Your current average is " + current_average * 100 + "%");
        
        System.out.println("How many more points will be offered this term?");
        int points_left = kboard.nextInt();
        
        int A_points = (int)Math.ceil(0.9*(points_left + points_available) - (points_earned));
        if (A_points <= 0)
        A_points = 0;
        double A_percent = (double)A_points / (points_left);
        
        int B_points = (int)Math.ceil(.8 * (points_left + points_available) - points_earned);
        if (B_points <= 0)
        B_points = 0;
        double B_percent = ((double)B_points / (points_left));
        
        int C_points = (int)Math.ceil(.7 * (points_left + points_available) - points_earned);
        if (C_points <= 0)
        C_points = 0;
        double C_percent = ((double)C_points / (points_left));
        
        int D_points = (int)Math.ceil(.6 * (points_left + points_available) - points_earned);
        if (D_points <= 0)
        D_points = 0;
        double D_percent = ((double)D_points / (points_left));
        
        System.out.println("listed below are the minimum number of points you need to earn over the rest of the semester to receive each letter grade:");
        
        System.out.println("A - " + A_points + " / " + points_left + "( " + A_percent * 100 + " %)");
        System.out.println("B - " + B_points + " / " + points_left +"( " + B_percent * 100 + " %)");
        System.out.println("C - " + C_points + " / " + points_left + "( " + C_percent * 100 + " %)");
        System.out.println("D - " + D_points + " / " + points_left + "( " + D_percent * 100 + " %)");
      
        
        
  
    }
}
