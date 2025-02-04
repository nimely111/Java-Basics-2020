
/*
Write a program that will print out grades based on the number of points a 
student got on the exam. The number of point is between 
0 and 100.
 * The grading criteria is as follow:

 *        POINTS             GRADE
 *        86-100               A
 *        76-85                B
 *        66-75                C
 *        56-65                D
 *        <= 55                F

hint Scanner in = new Scanner(System.in)
 *  int name = in.nextInt();
*/
package quiz_task;
import java.util.Scanner;
public class Quiz_Task {
    public static void main(String[] args) {
        // this is the code that prompt the user to enter input
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your points! ");
        int name = in.nextInt();
        
        
        
       int quizTask = 77; 
       char grade;
       // this is the code for or || in java
       if(quizTask >= 86 && quizTask <= 100 )
       {
       grade = 'A';
       }
       else if(quizTask >= 76 && quizTask <= 85){
       grade = 'B';
       }
       else if(quizTask >= 66 && quizTask <= 75){
       grade = 'C';
       }
       else if(quizTask >= 56 && quizTask <= 65){
       grade = 'D';
       }
       else{
       grade = 'F';
       }
       
        System.out.println( "You got  " + grade + " on the test. ");
        
        
         Scanner input = new Scanner(System.in);
        System.out.println("Please enter your points! ");
        int name1 = input.nextInt();
        
        
         int quizTask1 = 97; 
       char grade1;
       // this is the code for or || in java
       if(quizTask1 >= 86 && quizTask1 <= 100 )
       {
       grade1 = 'A';
       }
       else if(quizTask1 >= 76 && quizTask1 <= 85){
       grade1 = 'B';
       }
       else if(quizTask >= 66 && quizTask <= 75){
       grade1 = 'C';
       }
       else if(quizTask1 >= 56 && quizTask1 <= 65){
       grade1 = 'D';
       }
       else{
       grade1 = 'F';
       }
       
        System.out.println( "You got  " + grade1 + " on the test. ");
        
         
    }
    
}
