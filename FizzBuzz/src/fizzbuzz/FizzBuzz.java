
package fizzbuzz;
import java.util.Scanner;

public class FizzBuzz {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your country color code");
        int country_code = scanner.nextInt();
        
       
            if(country_code % 5 == 0 && country_code % 3 == 0){
                System.out.println("FizzBuzz");
            }else if(country_code % 5 == 0){
                System.out.println("Fizz");
            }else if(country_code % 3 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println("Your country code is not in the range");
            } 
                country_code++;
                System.out.println("The value of your country code is: "+ country_code);
    }
    
}
