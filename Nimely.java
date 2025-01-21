
import java.util.ArrayList;

public class Nimely {

  // this class is found in the java.util package
  public static void main(String[] args) {

    // create an arrayList
    ArrayList<String> activeUsers = new ArrayList<String>();

    // String[] activeUsers = new String[3];
    // the initial ArrayList has no element in it at this point
    System.out.println("ArrayList initially: " + activeUsers);
    // add users using the add() method
    activeUsers.add("Sam");
    System.out.println("ArrayList after adding one element: " + activeUsers);
    activeUsers.add("Lua");
    System.out.println("ArrayList after adding two element: " + activeUsers);
    activeUsers.add("Tony");
    System.out.println("ArrayList after adding three element: " + activeUsers);

    // remove users using the remove() method
    activeUsers.remove("Sam");
    System.out.println("ArrayList after removing one element: " + activeUsers);
    activeUsers.remove("Lua");
    System.out.println("ArrayList after removing two element: " + activeUsers);
    activeUsers.remove("Tony");
    System.out.println("ArrayList after removing three element: " + activeUsers);
    System.out.println(".........................................................");
    ArrayList<String> activeUsers1 = new ArrayList<>();
    activeUsers1.add("1");
    System.out.println("ArrayList1 after adding one element: " + activeUsers1);
    activeUsers1.add("2");
    System.out.println("ArrayList1 after adding two element: " + activeUsers1);
    activeUsers1.add("3");
    System.out.println("ArrayList1 after adding three element: " + activeUsers1);

    int sum = Integer.parseInt("1");
    int sum1 = Integer.parseInt("2");
    int sum2 = Integer.parseInt("3");
    int totalSum = sum + sum1 + sum2;
    System.out.println("The Total ArrayList1 is: " + totalSum);

    activeUsers1.remove("1");
    System.out.println("ArrayList after removing one element: " + activeUsers);
    activeUsers1.remove("2");
    System.out.println("ArrayList after removing two element: " + activeUsers);
    activeUsers1.remove("3");
    System.out.println("ArrayList after removing three element: " + activeUsers);
    System.out.println(".........................................................");

    int n = Integer.parseInt("5");
    System.out.println(n + 5);

    /*
     * int a = 5;
     * int b = 4;
     * int c = Integer.reverse(b);
     * int n = Integer.parseInt("5");
     * System.out.println(n + 5);
     * 
     * /* int a = 5;
     * int b = 4;
     * System.out.println(c);
     */
    // System.out.println(myArray1[0]);
  }

}
