//Quiz Solution
 
package quizsolution;
import java.util.Scanner;

public class QuizSolution {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of points: ");
        int points = in.nextInt();
        
        if(points < 0 || points > 100)
            System.out.println("The number of points between 0 and 100");
        else if (points <=55)
            System.out.println("Your grade is F");
        else if (points <=66)
            System.out.println("Your grade is D and you are not doing well");
        else if (points <=76)
            System.out.println("Your grade is C");
        else 
            System.out.println("Your grade is A and you are at yor very best");
        in.close();
        
       
    }
    
}
