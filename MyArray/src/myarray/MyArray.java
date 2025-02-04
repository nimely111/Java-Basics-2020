package myarray;

public class MyArray
{

public static void main(String[]args)
{
// Declaration of variables
    double[] myList = {1.9, 2.9,3.4,3.5};
// let's print all the array element using forloop 
for(int i = 0; i < myList.length; i++)
{
    System.out.println(myList);
}
// concatinating or suming of all the element
double total = 0;
for(int i = 0; i < myList.length; i++)
{
total += myList[i];
}
    System.out.println("The total is: " +total);
}
}

