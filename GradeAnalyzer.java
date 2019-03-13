
/**
 * Takes input about points earned on various assignments and produces the overall average, and lowest and highest averages
 *
 * @author Annie Radillo
 * @version 9/5
 */
import java.util.Scanner;
public class GradeAnalyzer
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("How many assignments have you had so far?");
        int numAs = kb.nextInt();
        
        double max = 0;
        double min = 1;
        int total_points_got = 0;
        int total_points = 0;
        int max_i = 0;
        int min_i = 0;
  
        for (int i = 1; i <= numAs; i++)
        {
            System.out.println("Enter the points earned on assignment # " + i);
            int points_got = kb.nextInt();
            total_points_got = total_points_got + points_got;
            System.out.println("Enter the point value on assignment # " + i);
            int points = kb.nextInt();
            total_points = total_points + points;
            
            if ( ((double)points_got / points) > max)
            {
                max = (double)points_got / points;
                max_i = i;
            }
            if (((double)points_got / points) < min)
            {
                min = (double)points_got / points;
                min_i = i;
            }
        }
        
        double avg = (double)total_points_got / total_points * 100;
        System.out.println("Your current average in the class is " + avg + "%.");
        System.out.println("Your highest percentage was " + max * 100 + "% on assignment #" + max_i + ".");
        System.out.println("Your lowest percentage was " + min * 100 + "% on assignment #" + min_i + ".");
        
        
    }
}
