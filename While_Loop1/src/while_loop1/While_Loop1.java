// while loop is a conditional statement that execute 
// a line of code as long as a given condition is true
// it also serves as a boolean expression True / False

package while_loop1;
import java.util.Scanner;
public class While_Loop1 {

    public static void main(String[] args) {
        // this is what prompt the user to enter something
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number! ");
        int value = scanner.nextInt();
        
        if(value > 0)
        {
            System.out.println("You have enter a positive number! ");
        }
        if(value < 0)
        {
            System.out.println("You have enter a negative number! ");
        }
       
    }
    
}
