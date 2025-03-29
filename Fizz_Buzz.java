import java.util.Scanner;

public class Fizz_Buzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please pick your country color number ");
        int number = scan.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Select a number that is divisible by 5 or 3");
        }

        number++;
        System.out.println("The value you enter is: " + number);

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
