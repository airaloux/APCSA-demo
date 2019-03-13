
/**
 * an introduction to data types
 *
 * @author annie radillo
 * @version 8/9
 */
public class DataTypes
{
    public static void main(String[] args)
    {
        System.out.println(7 * 5);
        int num1;
        num1 = 2;

        int num2 = 8;

        int num3 = num1 * num2;

        num2 = 5;
        System.out.println(num1 + num2);
        System.out.println(num3);
        
        //byte has width of eight bits and holds value -128 and 127
        
        byte myByte = 125;
        System.out.println((byte)(myByte + 10));
         
        
        //Short has a width of 16 bits; holds value between -32,768 and 32,767
    
        short myShort = 4387;
        
        //int has a width of 32 bits; holds values between -2^61 and 2^63-1
        int myInt = 543_433_654;
        
        //long has a width of 64 bits; holds values between -2^63 and 2^63-1
        long myLong = 3543730284L;
        
        //***************************//
        
        //float has a width of 32 bits and holds a floating point value
        float myFloat = 54.43F;
        
        //double has a width of 64 bits and holds a floating point value
        double myDouble = 43456.9D;
        
        //use ints and doubles in class
        
        //****************************//
        //char holds a single character; wrap in single quotes
        char myChar = 'g';
        char myChar2 = '\u0973';
        System.out.print ("myChar: 'g" + myChar);
        System.out.print (myChar2);

        
        //booleans holds true or false; one bit wide
        boolean myBool = false;
        
        //Strings are objects, not primitive data types; wrap in double quotes
        String name = "annie";
        
    }
}
