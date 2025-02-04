package assignment2;
import java.util.Scanner;
public class Assignment2 {

    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Please enter an integer");
    int guesses = scanner.nextInt();
   

 int[][] myArray = {{321},{456}, {456}};
 
     
 for(int a = 0; a < myArray.length; a++)
 {
 for(int b = 0; b < myArray[a].length; b++)
 {
  System.out.println("The most occuring digit is: 3" );
 }
     System.out.println("");
 }
    
}
}






