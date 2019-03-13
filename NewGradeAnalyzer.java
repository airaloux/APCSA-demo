
/**
 * Write a description of class NewGradeAnalyzer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NewGradeAnalyzer
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("How many assignments do you have?");
        int numassigned = kb.nextInt();
        
        int [][] array = new int[numassigned][3];
        
        for (int i = 0; i < numassigned; i ++)
        {
            System.out.println("Enter assignment type for assignemt # " + (i+1) + "(1- hw, 2- discussion, 3- test): ");
            int type = kb.nextInt();
            
            
            array[i][0]= type;
            
            System.out.println("Enter points earned for assignemt # " + (i+1) + "(1- hw, 2- discussion, 3- test): ");
            int earned = kb.nextInt();
            
            array [i][1] = earned;
            
            System.out.println("Enter points possible on assignemt # " + (i+1) + "(1- hw, 2- discussion, 3- test): ");
            int possible = kb.nextInt();
            
            array[i][2] = possible;
          
        }
        
        int hwpossible = 0;
        int hwattained = 0;
        int discussionpossible = 0;
        int discussionattained = 0;
        int testpossible = 0;
        int testattained = 0;
        int totalpossible = 0;
        int totalattained = 0;

        for (int row = 0; row < numassigned; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                if (array[row][col] == 1)
                {
                hwattained += array[row][1];
                hwpossible += array[row][2];
                totalattained += array[row][1];
                totalpossible += array[row][2];
         
                }
                
                else if(array[row][col]==2)
                {
                discussionattained += array[row][1];
                discussionpossible += array[row][2];
                totalattained += array[row][1];
                totalpossible += array[row][2];
          
                }
                
                else if(array[row][col] == 3)
                {
                testattained += array[row][1];
                testpossible += array[row][2];
                totalattained += array[row][1];
                totalpossible += array[row][2];
            
                }
                
            }
        }
        
        
        
        System.out.println("your current grade: ");
        System.out.println("Howmework (30%): " + (double)hwattained/hwpossible * 100 + " %");
        System.out.println("Discussion (25%): " + (double)discussionattained/discussionpossible * 100 + " %");
        System.out.println("Test (45%): " + (double)testattained/testpossible * 100 + " %");
        System.out.println("Total (100%): " + ((double)hwattained/hwpossible*.3*100 + (double)discussionattained/discussionpossible*.25*100 + (double)testattained/testpossible*.3*100) + " %");
    }
    
    
}
