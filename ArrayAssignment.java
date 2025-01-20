
/*In this assignment, I use the following topics: Scanner, if statement,
while loop, switch, and avove all the powerful Arrays container*/
import java.util.Scanner;

public class ArrayAssignment {

      public static void main(String[] args) {
            Scanner numCheck = new Scanner(System.in);
            System.out.println("Please enter location index b/w 0 and 9");
            System.out.println("Pleasse Enter your location index");
            // NOte that Arrays deals with indexing
            int index = numCheck.nextInt(); // without this code ou

            if (index < 0 || index > 9)
                  System.out.println("The number of index between 0 and 9");

            System.out.println("*************************************************");

            String[] sinkorStreets = new String[10];
            // at this point I will add elements to my list
            sinkorStreets[0] = "1st Street";
            sinkorStreets[1] = "2nd Street";
            sinkorStreets[2] = "3rd Street";
            sinkorStreets[3] = "4th Street";
            sinkorStreets[4] = "5th Street";
            sinkorStreets[5] = "6th Street";
            sinkorStreets[6] = "7th Street";
            sinkorStreets[7] = "8th Street";
            sinkorStreets[8] = "9th Street";
            sinkorStreets[9] = "10th Street";

            // Declaration of our arrays
            String[] sinkorStreets2 = { "1st Street", "2nd Street", "3rd Street", "4th Street", "5th Street",
                        "6th Street", "7th Street", "8th Street", "9th Street", "10th Street" };
            int size = sinkorStreets2.length;
            System.out.println("The number of streets in your area: " + size);

            // now I will print out my array in incremental order using while loop
            int i = 0;
            while (i < size) {
                  // I need to make a modification on this line of code
                  System.out.println("index [" + i + "]" + sinkorStreets2[i]);
                  i++;
            }
            switch (index) {
                  case 0:
                        System.out.println("Your index is zero and, your location 1st Street");
                        break;
                  case 1:
                        System.out.println("YourYour index is one and, your location 2nd Street");
                        break;
                  case 2:
                        System.out.println("Your index is two and, your location 3rd Street");
                        break;
                  case 3:
                        System.out.println("Your index is three and, your location 4th Street");
                        break;
                  case 4:
                        System.out.println("Your index is four your location 5th Street");
                        break;
                  case 5:
                        System.out.println("Your index is five and, your location 6th Street");
                        break;
                  case 6:
                        System.out.println("Your index is six and, your location 7th Street");
                        break;
                  case 7:
                        System.out.println("Your index is seven and, your location 8th Street");
                        break;
                  case 8:
                        System.out.println("Your index is eight and, your location 9th Street");
                        break;
                  case 9:
                        System.out.println("This index is nine and, your location 10th Street");
                        break;
                  default:
                        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& ");
                        System.out.println("Your index is not in the range");
                        System.out.println("Please try again");
                        break;

            }
            numCheck.close();
      }

}
