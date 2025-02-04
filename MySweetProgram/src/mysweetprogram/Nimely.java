/*
variables and oerators hpw they are use?
variables and operators are pairs of programmiing. variables name can be
change but, operators are constant depending on the kind of result
you  wanna receive.
*/
package mysweetprogram;

import java.util.Scanner;


public class Nimely {


    public static void main(String[] args) {
        // in a normal while loop when we get the correct answer it just jump over the while
        // now lwt make it a do while loop
        //initialization condition and the   structure is  a bit different
       // just
        //we willdefine the password up to forloop
                String password = "let me in";
                Scanner scanner = new Scanner(System.in);
                // let define it outside of the loop
                String guess;
                String name = "Sam";
                
                // we are doing this because we are going to use it
                // inside of the while here
        do
        {  //this gonna execute at least once. beccause we 
            //always wnats to ask the person fr the pass word
            
            System.out.println("Guess  the password:");
  // we gonna move the guess inside of te whileloop because we wanna guess atleast one time
             guess = scanner.nextLine();
    //anything you are going to do inside of the while piece,
    // make sure to define outside of the  do while session
        }while(!guess.equals(password));
     
        System.out.println("Congrats" + name);
        scanner.close();
        
        
}
    
}
 