//Applying Next condition
 
package quizsolution3;
import java.util.Scanner;

public class QuizSolution3 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of points: ");
        int points = in.nextInt();
        
        char grade = 'F';
        
        if(points <= 0 || points >= 100)
            System.out.println("The number of points between 0 and 100");
        
        else if (points <= 50){
        grade = 'F';
            System.out.println("Your grade is F");
        }
        
        else if (points <56){
        grade = 'D';
            System.out.println("Your grade is D");
        }
        
        
        else if (points < 71)
        {
        grade = 'C';
        if(points < 61)
            System.out.println("Your grade is C-");
        if(points < 66)
            System.out.println("Your grade is C");
        else
            System.out.println("Your grade is C+");
        }
        else if (points < 86)
        {
            grade = 'B';
          if (points < 76)
            System.out.println("Your grade is B-");  
        if (points < 81)
            System.out.println("Your grade is B");
      else
            System.out.println("Your grade is B+");
        
}
        else
{
    grade = 'A';
          if (points < 91)
            System.out.println("Your grade is A-");  
        if (points < 96)
            System.out.println("Your grade is A");
      else
            System.out.println("Your grade is A+");
        
}
    switch(grade)
    {
        case'A':
            System.out.println("Excellent!");
            break;
            case'B':
            System.out.println("Well done!");
            break;
        case'C':
            System.out.println("Needs more work.");
            break;
        case'F':
            System.out.println("You have failed the exam.");
            break;
        default:
            System.out.println("No grade enter");
            break;
    }
        
       
        in.close();
        
       
    }
    
}
