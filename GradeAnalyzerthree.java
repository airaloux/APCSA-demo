
/**
 * Write a description of class GradeAnalyzerthree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GradeAnalyzerthree
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("How many assignments do you have in this class?");
        int numassigned = kb.nextInt();
        int [][] arr = new int[numassigned][];
        
        for (int i = 0; i < numassigned; i++)
        {    
            System.out.println("Enter the assignment type for assignment # " + i+1 + ":");
            int type = kb.nextInt();
            System.out.println("Enter the points earned for assignment #" + i+1 + ":");
            int ptsEarned = kb.nextInt();
            System.out.println("Enter the points possible for assignment #" + i+1 + ":");
            int ptsPossible = kb.nextInt();
            
            arr[i][0] = type;
            arr[i][1] = ptsEarned;
            arr[i][2] = ptsPossible;
                
            
        }
        
        
    }
}
