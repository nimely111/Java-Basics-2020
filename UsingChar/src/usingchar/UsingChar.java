
package usingchar;


public class UsingChar {

    
    public static void main(String[] args) {
        char character;
      
        //character = 'A';
       
        /*System.out.println(character);
        character++;
         System.out.println(character);
        character++;
         System.out.println(character);
        character++;
 
        character = 85;
        System.out.println(character);*/
        int i;
        for(i = 30; i <= 126; i++){
        character = (char) i;
            System.out.println("The Code " + i + "correspond to " + character);
        
        
        }
        
    }
    
}
