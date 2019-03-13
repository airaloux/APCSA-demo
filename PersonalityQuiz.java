
/**
 * This Greek Gods Personality Quiz tells you what percent of your blood belongs to each of four featured gods
 *
 * @author Annie Radillo
 * @version 8/28
 */

import java.util.Scanner;
public class PersonalityQuiz
{
    
    public static void main(String [] args)
   {
       Scanner kboard = new Scanner(System.in);
       
     
       int AtScore = 0;
       int ApScore = 0;
       int DiScore = 0;
       int HeScore = 0;
       int Anger = 0;
       System.out.println("how would you describe yourself: ");
       System.out.println(" 1  - Care free and fun-loving");
       System.out.println(" 2- intense, thoughtful, and often serious");
       System.out.println(" 3- warm, generous and nurturing");
       System.out.println("4- artistic, somewhat egotistical, and fiercely loyal");
       
       int userPick2 = kboard.nextInt();
       switch (userPick2)
       {
            case 1:
                DiScore = DiScore + 1;
                break;
            case 2:
                AtScore = AtScore + 1;
                break;
            case 3:
                HeScore = HeScore + 1;
                break;
            case 4:
                ApScore = ApScore + 1;
                break;
            default:
                System.out.println("You have not answered within the guidelines of this sacred quiz. Feel the wrath of Zeus.");
                Anger++;
                break;
                
       }
       
       System.out.println("What do you seek in other people?");
       System.out.println("1- obvious intellect and a love of learning");
       System.out.println("2- creative energy and passion");
       System.out.println("3- kindness and openess. You seek someone you can trust.");
       System.out.println("4- never-ending fun and entertainment! Someone who you can drag to every party!");
       
       int userPick3 = kboard.nextInt();
       switch (userPick3)
       {
            case 1:
                AtScore = AtScore + 1;
                break;
            case 2:
                ApScore = ApScore + 1;
                break;
            case 3:
                HeScore = HeScore + 1;
                break;
            case 4:
                DiScore = DiScore + 1;
                break;
            default:
                Anger++;
                System.out.println("You have not answered within the guidelines of this sacred quiz. Feel the wrath of Zeus.");
       }
       
       System.out.println("You offered your pick of the four following gifts: a guitar, the latest high-speed genome sequencer, a case of beer, and a hand-woven blanket. what do you choose?");
       System.out.println("1- the guitar");
       System.out.println("2- the genome sequencer");
       System.out.println("3- the hand-woven blanket");
       System.out.println("4- the case of beer");
       
       int userPick4 = kboard.nextInt();
       switch (userPick4)
       {
            case 1:
                ApScore = ApScore + 1;
                break;
            case 2:
                AtScore = AtScore + 1;
                break;
            case 3:
                HeScore = HeScore + 1;
                break;
            case 4:
                DiScore = DiScore + 1;
                break;
            default:
                Anger ++;
                System.out.println("You have not answered within the guidelines of this sacred quiz. Feel the wrath of Zeus.");
       }
       
       System.out.println("What job would you prefer?");
       System.out.println("1- an astrophysicist");
       System.out.println("2- a member of an extremely popular, frequently touring band");
       System.out.println("3- a music producer, or poet");
       System.out.println("4- kindergarten teacher");
       
       int userPick5 = kboard.nextInt();
       switch (userPick5)
       {
            case 1:
                AtScore = AtScore + 1;
                break;
            case 2:
                DiScore = DiScore + 1;
                break;
            case 3:
                ApScore = ApScore + 1;
                break;
            case 4:
                HeScore = HeScore + 1;
                break;
            default:
                Anger++;
                System.out.println("You have not answered within the guidelines of this sacred quiz. Feel the wrath of Zeus.");
       }
       
       System.out.println("If given your choice of pet, which would you choose?");
       System.out.println("1- A snow leopard");
       System.out.println("2- a raven");
       System.out.println("3- a wolf");
       System.out.println("4- a peacock");
       
       int userPick6 = kboard.nextInt();
       switch (userPick6)
       {
            case 1:
                AtScore = AtScore + 1;
                break;
            case 2:
                ApScore = ApScore + 1;
                break;
            case 3:
                HeScore = HeScore + 1;
                break;
            case 4:
                DiScore = DiScore + 1;
                break;
            default:
                Anger++;
                System.out.println("You have not answered within the guidelines of this sacred quiz. Feel the wrath of Zeus.");
       }
       
       double ApPercent = (double)ApScore / 5 * 100.00;
       double AtPercent = (double)AtScore/5 * 100.00;
       double HePercent = (double)HeScore/ 5 * 100.00;
       double DiPercent = (double)DiScore / 5 * 100.00;
       
       System.out.println("You are " +  AtPercent + " percent athena's spawn");
       System.out.println("You are " + ApPercent + " percent apollo's spawn");
       System.out.println("You are " + HePercent + " percent Hestia's spawn");
       System.out.println("You are " + DiPercent + " percent Dionysus' spawn");
       System.out.println("You have incurred Zeus' wrath" + Anger + " times. Lose your first born child");
   
   
   }
       
}
