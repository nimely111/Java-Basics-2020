
package if_loop1;

import java.util.Scanner;

public class If_Loop1 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are  you? ");
        
        int age = reader.nextInt();
        
        if(age > 0 )
        {
        if(age < 18)
        {
            System.out.println("You are a Minor! ");
        }
        else if(age > 100)
        {
            System.out.println("Wow! you have live more than a " + age + " Biblical age. That is amazing");
        }
         else
        {
            System.out.println("You are not a Minor");
        }
        
        }
          else
        {
        System.out.println("Your age cannot be negative");
        }
        
  // ctrl + space for completion of codes
  
    }
    
}
