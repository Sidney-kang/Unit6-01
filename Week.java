/****************************************************************************
 *
 * Created on : 21 Dec. 2017
 * Created for : ICS3UR
 * Daily Assignment - Unit6-01
 * This program returns the users favourite day of the week,
 *   after the user has entered a number
 *
 ****************************************************************************/
import java.util.Scanner;

public class week 
{   
    enum validDays 
    {
         Sunday(1), Monday(2), Tuesday(3), Wednesday(4), Thursday(5), Friday(6), Saturday(7);        
         
         private final int value;

         validDays(int value) 
         {
              this.value = value;
          }

         public int getValue() 
         {
              return value;
          }
    }
  
    public static void main(String[] args)
    {
         // input
         System.out.println("What day of the week is your favourite? Please enter the # that corresponds with that day of the week.");
         Scanner problem = new Scanner(System.in);
         int userInput = (problem.nextInt());
         //System.out.println(UserChoice);
         
         while (userInput < 1 || userInput > 7) 
         {
              System.out.println("Sorry, that is not a valid day. Please enter a number between 1 and 7.");
              System.out.println("What day of the week is your favourite? Please enter the # that corresponds with that day of the week.");
              userInput = (problem.nextInt());
          }
    
         for (validDays day: validDays.values()) 
         {
              if (userInput == day.getValue()) 
              {
                   System.out.println("Your favourite day is " + day);
               }
          }     
     }
}
