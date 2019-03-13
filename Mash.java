
/**
 * tells us the fuure! or something (future!?)
 *
 * Annie Radillo
 * @version 9/13
 */
import java.util.Scanner;
public class Mash
{
  public static void main(String args [])
  {
      String [] dwellings = {"a kaleidescope", "a sky with diamonds", "a tangerine tree", "a marshmellow pie"};
      Scanner kb = new Scanner(System.in);
      System.out.println("Let's play MASH of the future!");
      System.out.println("Enter four jobs of the future (each on a seperate line)");
      String [] jobs = new String [4];
      for (int i = 0; i < jobs.length; i++)
        jobs [i] = kb.nextLine();
        
      
      System.out.println("Great! Now enter four places to live in the future (each on a new line)");
      String [] places = new String [4];
      for (int i = 0; i < places.length; i++)
        places [i] = kb.nextLine();
   
      
      System.out.println("Okay, now enter four futuristic modes of transportation (each on a new line)");
      String [] transport = new String [4];
      for (int i = 0; i < transport.length; i++)
        transport [i] = kb.nextLine();
  
      
      System.out.println("These are the options for your future: .....");
      System.out.println("Dwellings: a kaleidescope, a sky with diamonds, a tangerine tree, a marshmellow pie");
      System.out.print("Jobs: ");
      for (int i = 0; i < jobs.length; i++)
      {  
      System.out.print( jobs[i] );
        if (i < (jobs.length-1))
            System.out.print(" ,");
      
      }
      
      System.out.println(".");
      
      System.out.print("Places: ");
      for (int i = 0; i < places.length; i++)
      {  
      System.out.print( jobs[i] );
        if (i < (places.length-1))
            System.out.print(" ,");
      
      }
      
      System.out.println(".");
      
      System.out.print("Transportation: ");
      for (int i = 0; i < transport.length; i++)
      {  
      System.out.print( jobs[i] );
        if (i < (transport.length-1))
            System.out.print(" ,");
      
      }
      
      System.out.println(".");
      System.out.println("");
      
      int randdwelling = (int)Math.random() * dwellings.length;
      int randjob = (int)Math.random() * jobs.length;
      int randplace = (int)Math.random() * places.length;
      int randtransport = (int)Math.random() * transport.length;
      
      System.out.println("Now to determine YOUR future: ");
      System.out.println("Your dwelling: " + dwellings[randdwelling]);
      System.out.println("Your job: " + jobs[randjob]);
      System.out.println("Your mode of transportation: " + transport[randtransport]);
      System.out.println("");
      System.out.println("Hope that wasn't too dissapointing!");
      
      
    }
     
      
      
   }

