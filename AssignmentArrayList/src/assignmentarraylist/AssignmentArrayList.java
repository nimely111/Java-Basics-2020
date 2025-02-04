
package assignmentarraylist;

import java.util.ArrayList;


public class AssignmentArrayList {

   
    public static void main(String[] args) 
{
   ArrayList<Integer> myArray = new ArrayList<>();
  
    System.out.println("ArrayList Initially: " + myArray);
    
    myArray.add(1);
    System.out.println("ArrayList after adding first element " +myArray);
    myArray.add(2);
    System.out.println("ArrayList after adding second element " +myArray);
    myArray.add(3);
    System.out.println("ArrayList after adding third element " +myArray);
    myArray.add(4);
    System.out.println("ArrayList after adding fourth element " +myArray);

   
         // remove users using the remove() method
         myArray.remove(0);
         System.out.println("ArrayList after removing first element " +myArray);
         myArray.remove(1);
         System.out.println("ArrayList after removing second element " +myArray);
         

     

    
    
 
}
    
}
