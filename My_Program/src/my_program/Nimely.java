/*
In this program I am going to use the Scanner class, the 2D Array,and Nested ForLoop
 */
package my_program;

import java.util.Scanner;

public class Nimely 
{
    public static void main(String[] args) 
{ // Thank God Almighty For me doing this code on my own again!!!
      
    // 3. we can invite our Scanner class
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter you favorite Index ");
     int n = scan.nextInt();

    
    // 1. Let's now begin with our 2DArray
  int[][] numberGrid = {
                          {1, 2, 3}, 
                          {4, 5, 6},
                          {7, 8, 9},
                          {0}
                        }; 
          
        // 2. We can start with out nested forLoop
        for (int i = 0; i <numberGrid.length; i= i+1) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                
                System.out.print(numberGrid[i][j]);
            }
            System.out.println("");
        }  
      
    
}
}
