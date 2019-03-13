
/**
 * An introduction to arrays.
 *
 * @author Annie Radillo
 * @version 9/7
 */
public class Arrays
{
    public static void main(String [] args)
    {
        // int temp1 = 99;
        // int temp2 = 102;
        // int temp3 = 105;
        // int temp4 = 98;
        // int temp5 = 103;
        
        // double average = (temp1 + temp2 + temp3 + temp4 + temp5) / 5.0;
        // System.out.println("The average temperature is " + average + " degrees.");
        
        
        
        // int [] temps = {99, 102, 105, 98, 103, 107};
        
        // System.out.println(temps[0]);
        
        
        // System.out.println("the temps array:");
        
        // //traversing an array
        // for (int i = 0; i < temps.length;  i ++)
        // {
            // System.out.println(temps[i] + "   ");
        // }
        
        // System.out.println();
        // int sum = 0;
        // for (int i = 0; i< temps.length; i++)
        // {
            // sum += temps[i];
        // }
        // double average2 = (double)sum/temps.length;
      
        
        // double [] nums = {1, 2, 3, 4, 6.7, 89.4, 100};
        // char [] letters = {'g', 't', 'r'};
        // String [] words = {"cat", "dog", "parrot", "onion"};
        
        // int [] unknowns = new int [10];
        // System.out.println(unknowns[3]); // defaults to value of 0 in every spot
        
        // int [] arr = {100, -25, 40};
        // int big = arr[0];
        // int place = 0;
        
        // for (int i = 0; i < arr.length; i++)
        // {
            // if (arr[i] < arr[place])
            // {
                
                // place = i;
            // }
            // else 
            // {
                // continue;
            // }
            
        // }
        // System.out.println(place);
        
        // //prints random names from array
        // String [] names = {"abby", "caspar", "david", "friedrich"};
        // int random = (int)Math.random() * names.length;
        // System.out.println(names[random]);
        
        
        //for each loop (the equivalent of a normal for loop in python)
        int [] nums3 = {5, 17, 291, 35};
        for(int num : nums3)
        {
            System.out.print(num + " ");
        }
        
       
        
        String [] words = {"apple", "frog", "wool", "fog", "silver"};
        
        for (String word : words)
        {
            System.out.print(word + " ");
        }
        
        String [] wordss = new String [10];
        System.out.println(wordss.length);
        
    
        int sum = 0;
        for (int num : nums3)
        {
            sum += num;
        }
        System.out.println(sum);
        
        
       
    }
}
