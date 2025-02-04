
package if_loop2;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) 
 {
     Scanner reader = new Scanner(System.in);
     System.out.println("Enter a Number: ");
     double n = reader.nextDouble();
     // a system that can accept both 10 and hundred only assignment
     if(n > 0)
     {
         System.out.println("You have enter a positive number");
     }
     
     if(n < 0)
     {
         System.out.println("You have  enter a negative number");
 }
 }
 }
