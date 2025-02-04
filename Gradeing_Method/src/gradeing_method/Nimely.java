 /* I am a long comment.

*/
package gradeing_method;

import java.util.Scanner;


public class Nimely {

    
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade  point ");      
      int sGrade = scan.nextInt();
      if(sGrade < 0 || sGrade >= 100){
          System.out.println("please enter number between 0 and 100");
      }
      
      if(sGrade >= 90 && sGrade < 101){
          System.out.println("A" + "- Excellence");
          
          
      }else if(sGrade >= 80 && sGrade < 90){
          System.out.println("B" + " Very Good");
      
    }else if(sGrade >= 70 && sGrade < 80){
          System.out.println("C" + " Good");
    
}else if(sGrade >= 65 && sGrade < 70){
          System.out.println("D" + " You pass Under-Condition");
      
}else if(sGrade >= 0 && sGrade < 65){
          System.out.println("F" + " You Failed");
    }else{
          System.out.println("The number you enter is not in the range");
}
      
      // I am a short comment
      
      /**/ 
     
      
}
}
