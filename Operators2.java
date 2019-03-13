
/**
 * Write a description of class Operators2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Operators2
{
    public static void main (String [] args)
    {
        int result = 1 +2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        
        result = result - 1;
        System.out.println(previousResult + " -1 = " + result);
        previousResult = result;
        
        result = result * 10; 
        System.out.println(previousResult + "* 10 = " + result);
        previousResult = result;
        
        result = result / 5;
        System.out.println(previousResult + "/5 = " + result);
        
        result = result % 3;
        System.out.println(previousResult + "%3 = " + result);
        previousResult = result;
        
        
        //&&&&&&&&&&&&&&&&&&&//
        
        
        result = result + 1;
        System.out.print("result is now equal to" + result);
        result ++;  //adds one to result a second time

        
        result--; //subtracts one from result
        System.out.print("result is now equal to" + result);
        result +=10; //adds ten to result
        System.out.print("result is now equal to" + result);
        result *= 4; //multiplies result by 4; same technique works with division, mods
       
        //%%%%%%%%%%%%%%%%%%%%%%%%//
        
        int num = 50;
        
        if (num == 50)

            System.out.println( "\n num is 50");
        
        if (num != 50)
        
            System.out.println("Num is not 50");
        
        if (num <= 75)
            System.out.println("num is less than or equal to 75");
        
        if (num > 30 && num < 60)
            System.out.print("youve won the game!");
            
        if ((num <= 50) || (num >= 200)) // pipe-something means "or"
            System.out.println("you pass");
            

        
    }
}
