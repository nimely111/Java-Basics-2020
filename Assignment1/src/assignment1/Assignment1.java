// this is question number one
package assignment1;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     System.out.println("Please enter an integer");
        
int occurences = scan.nextInt();

int[][] myArray ={{321},{456}, {456}};
      
   int i;// declaring of variable
   
   // innitialization termination increament
   for( i = 0; i <= myArray.length; i++)
{
      
   if(i != myArray.length)
{
      System.out.println("The most occuring digit is 3. ");  
}
}
          
}
    
}
