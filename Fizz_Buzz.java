import java.util.Scanner;

/**
 *
 * @author Prince Kossigbo
 */
public class Fizz_Buzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please pick your country color number ");
        int number = scan.nextInt();

        while (number <= 35) {

            if (number % 5 == 0 && number % 3 == 0) {
                System.out.println("Red White and Blue");
            } else if (number % 5 == 0) {
                System.out.println("Red");
            } else if (number % 3 == 0) {
                System.out.println("Blue");
            } else {
                System.out.println("Your color number is not in the range");
            }

            number++;
            System.out.println("The value of myNumber is: " + number);
        }

        /*
         * switch(number){
         * case 1:
         * System.out.println("This is Liberia");
         * break;
         * case 2:
         * System.out.println("This is Nigeria");
         * break;
         * case 3:
         * System.out.println("This is China");
         * break;
         * default:
         * System.out.println("You didn't select any colors");
         * 
         * }
         */

    }
}
