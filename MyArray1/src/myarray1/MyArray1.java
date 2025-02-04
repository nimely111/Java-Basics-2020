
package myarray1;
/*
crreate an Array  of a container that has 10 items
using the Array of Strig[] Method.

*/

public class MyArray1 
{

 public static void main(String[] args) 
{ // an app that access or detect a student's bag
   // declaratin of varibles
String[] schoolBag = new String[4];
// add elements to the array
schoolBag[0] = "Books";
schoolBag[1] = "Pencils";
schoolBag[2] = "Erasers";
schoolBag[3] = "Calculator";

// Declaration of our arrays
String[] schoolBag2 = {"books", "Pencils", "Eraser", "Calculator"};
int size = schoolBag2.length;
System.out.println("The size of array is: " + size);

for(int i = 0; i < size; i++)
{
 System.out.println("index [" + i + "]" + schoolBag[i]);
}
    
}
    
}
