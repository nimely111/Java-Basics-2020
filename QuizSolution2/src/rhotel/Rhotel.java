//Applying Nessted condition
 
package rhotel;
import java.util.Scanner;

public class Rhotel {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your points: ");
        int points = in.nextInt();
        
        if(points < 0 || points > 100)
         System.out.println("please enter number of points between 0 and 100");
        // nested conditions is when an if condition is within another if's condition 
        // more than oe time.
        // for every if statement, there mst be a curley bracket for the expressions
        // to be simplify
        else if (points <=50)
            System.out.println("Your grade is F");
        else if (points <56)
            System.out.println("Your grade is D");
        
        else if (points < 71)
        {
        if(points < 61)
            System.out.println("Your grade is C-");
        if(points < 66)
            System.out.println("Your grade is C");
        else
            System.out.println("Your grade is C+");
        }
        else if (points < 86)
        {
          if (points < 76)
            System.out.println("Your grade is B-");  
        if (points < 81)
            System.out.println("Your grade is B");
      else
            System.out.println("Your grade is B+");
        
}
        else
{
          if (points < 91)
            System.out.println("Your grade is A-");  
        if (points < 96)
            System.out.println("Your grade is A");
      else
            System.out.println("Your grade is A+");
        
}   
        
       
        in.close();
        //this is an operation that closes the looping the input.
        
       
    }
    
}
