
package weight_conversion;


import java.util.Scanner;


public class Weight_Conversion {

   
    public static void main(String[] args) {
       // we going to as our user for their weight in pounds
       // and convert it to kilogram
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight in (Lbs): ");
        int weight_in_Lbs = scanner.nextInt();
        
       int var =  weight_in_Lbs;
        double weight_in_kg = weight_in_Lbs * 0.45;
        System.out.println("weight_in_kg is: "+ weight_in_kg);

      
    }
    
}
