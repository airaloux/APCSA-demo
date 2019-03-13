
/**
 * An intro to 2-D arrays
 *
 * @author Annie
 * @version 9/19
 */
public class TwoDimensionalArrays
{
        public static void main(String [] args)
        {
            int [][] nums = {
                {1, 2, 3}, 
                {4, 5, 6}, 
                {7, 8, 9}, 
                {10, 11, 12}
            };
            
            System.out.println(nums[2][0]);
            System.out.println(nums[0][1]);
            
            for (int i = 0; i < nums.length; i++)
            {
                for (int j = 0; j < nums[i].length; j++)
                {
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }
            
            //for each loop
            for (int [] arr : nums)
            {
                for (int i : arr)
                {
                    System.out.print( i + " ");
                }
                System.out.println();
            }
      
            
            int sum2 = 0;
            for (int row = 0; row < nums.length; row++)
            {
                for (int col = 0; col < nums[row].length; col++)
                {
                    sum2 += nums[row][col];
                }
            }
            System.out.println(sum2);
            
            //challenge:given a 2d array, create new 1D array that holds the sum of each array in 2D array
            //ex {7, 10, 13, 5}
            
            int[][] moreNums = {{7, 2, 8}, {3, 1, 6}, {5, 3, 6}, {3, 1, 1}};
            
            int [] array = new int[moreNums.length];
            
           
            for (int row = 0; row < moreNums.length; row++)
            {
                int sum3 = 0;
                for (int col = 0; col < moreNums[row].length; col++)
                {
                    sum3 = sum3 + moreNums[row][col];
                    System.out.println(sum3);
                }
                array [row] = sum3;
            }
            
        }
}
