// finding the average  value of a given set of  numbers
package mainarray;
/*import java.util.Scanner;
public class SamMainArray {
    
    private static Scanner scanner = new Scanner(System.in);
// method and classes
    public static void main(String[] args) 
{

      int[] myIntegers = new int[5];
      for(int i = 0; i < myIntegers.length; i++)
      {
          System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
      }
    //  System.out.println("The average" + getAverage);
}

public static int[] getIntegers(int number)
{
    System.out.println("Enter "  + number + "intteger values. \r");
    int [] values = new int[number];
    for(int i = 0; i < values.length; i++)
    {
    values [i] = scanner.nextInt();
    }
    return values;
}
// adding the sum code 

//public static double getAverage
    
}
*/
// this is a multiple array codes
public class SamMainArray {
    
    public static void main(String[] args) 
{
int [][] matrix = {{5, 4, 8}, // this is 3 by 3 matrix
                   {6, 7, 9},
                   {1, 2, 3}};
// this is another method for a matrix
int[][] matrix2 = new int[3][3];
        matrix2[0][0] = 5;       // sleep is for the week
        matrix2[0][1] = 4;
        matrix2[0][2] = 8;
        matrix2[1][0] = 6;
        matrix2[1][1] = 7;
        matrix2[1][2] = 9;
        matrix2[2][0] = 1;
        matrix2[2][1] = 2;
        matrix2[2][2] = 3;
// when you think of rows and columns, think of 2-Dimensional Arrays
        System.out.println(matrix2[0][0]);
        System.out.println(".........................");
        for(int x = 0; x < 3; x++){
            System.out.println(matrix[x][x]);// Diagonal the looping is changing
  // first print element 1-1 - 2-2 - 3-3       
        }
        System.out.println(".........................");
   for(int i = 0; i < matrix2.length; i++)
   {
   for(int j = 0; j < matrix2[i].length; j++)
   {
       System.out.print(matrix2[i][j] + " ");
   }
       System.out.println("");
   }
}
}
// for(int i = 0; i < 3; i++) APPLY ON BOTH SIDE

