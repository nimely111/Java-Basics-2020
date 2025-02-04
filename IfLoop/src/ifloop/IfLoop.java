// this program will intriduce us to te concept of if loop


package ifloop;

import java.util.Scanner;


public class IfLoop
{
public static void main(String[]args)
{
/*int x = 1;
for(;;){
if(x == 10)break;// this is where the condition take place
    
    System.out.println("After the loop, the value of x is: " +x);
    x++; 
    
}*/
// Declaration of variables
   // Scanner scanner = new Scanner(System.in);
   // System.out.println("Pleasse Enter your grade point: ");
   // int point = scanner.nextInt();
    
int testScore = 90;
char grade;


if(testScore >= 90)
{
grade = 'A';
}else if(testScore >=80){
grade = 'B';
}else if(testScore >=70){
grade = 'C';
}else if(testScore >= 60){
grade = 'D';
}else{
grade = 'F';
}
    System.out.println("Your Grade is: " + grade);   
}
}
   

