public class ArrayDemo {

  // array cannot be printed by it self it needs another data type to print it in
  // the other
  // that we want and nt to have decimal numbers
  public static void main(String[] args) // first method, which is the main method
  {

    // let's take a look at anoter method
    // This method will eable you to run single line or individual line item of the
    // array

    int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(myIntArray[0]);// this operation will
    // print a single item/line for you
    System.out.println(myIntArray[1]);
    System.out.println(myIntArray[2]);
    System.out.println(myIntArray[3]);
    System.out.println(myIntArray[4]);
    System.out.println(myIntArray[5]);
    System.out.println(myIntArray[6]);
    System.out.println(myIntArray[7]);
    System.out.println(myIntArray[8]);
    System.out.println(myIntArray[9]);
    // using the nested loop in inorder to achieve this

    /*
     * // using loops
     * 
     * int[] myIntArray = new int[10];
     * for(int i = 0; i < myIntArray.length; i++){
     * myIntArray[i] = i + 10;
     * }
     * printArray(myIntArray);
     * 
     * 
     * // remove the first forloop and replace it with the second for loop
     * }
     * // every new method must be outside of the previous method
     * public static void printArray(int[]array) // second method
     * {
     * for(int i = 0; i < array.length; i++)
     * {
     * System.out.println("Element " + i + ", value is " + array[i]);
     * }
     */
  }

}
