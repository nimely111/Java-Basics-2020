
package assignment1.pkg1;

import java.util.Scanner;

public class Assignment11 {

   
       public static void main(String[] args) 
    {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Please enter an integer");
    int guesses = scanner.nextInt();
   

 int[][] myArray = {{123},
                    {456}, 
                    {789}};
 
     
 for(int a = 0; a < myArray.length; a++)
 {
 for(int b = 0; b < myArray[a].length; b++)
 {
  System.out.print(myArray[a][b]);
 }
     System.out.println("");
 }
    
}
    
}
