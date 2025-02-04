/* 1. write a line comment //
2. Write a block comment /*
3.Declare an int variable myInt and Initialize it to 1
 4. Declare a double variabls in one line:
5. Declare three char variables in one line 
myChar1, myChar2, myChar3. Initialize myChar1 and myChar3 to '1' and 'b' respectively
6. print out the sum of myInt and myDouble.
7. Complete myInt to 10. Is it greater, lesser or equal to 10? print out all results.
8. Add myInt to myChar1. print out the result.
Now would  you explain the result?
 */
package assignment;

public class Assignment {

    public static void main(String[] args) {
        // This is a line comment 1 2
        /*This is a block comment 
        in is as usually */
        
    int myInt = 1; // 3
    
   double myDouble = 1.5d; // 4
   
   char   myChar1 = '1', myChar2,   myChar3 = 'b'; // 5
   
   
    double output1 =  myInt + myDouble; // 6
    //int output1 = (int) (myInt + myDouble);
    //system.out.println("The sum is: " + (myInt+myDouble)); quiz solution 6 answer
    
        
   
  int myInt1 = 2;
  int  myInt2 = 3;
  int  myInt3 = 4;
  int  myInt4 = 5;
  int  myInt5 = 6;
  int myInt6 = 7;
  int myInt7 = 8;
  int myInt8 = 9;
  int myInt9 = 10;
   
   int ans = myInt + myInt2 + myInt3 + myInt4 + myInt5 + myInt6 + myInt7 + myInt8 + myInt8 + myInt9;
    boolean myBoolean =  ans >=10; // 7
   
      char output2 = (char) (myInt + (int)myChar1); // 8
      
        
        //System.out.println("....................");
        System.out.println(myDouble);
        System.out.println(myInt);
    System.out.println(myInt +  " + " + myDouble + " = " + output1); // 6 - a
  System.out.println(myInt + " + "   + myChar1 + " = " + output2 ); // 8 - a
  // System.out.println("....................");
   System.out.println(myBoolean);
  
}  
}
