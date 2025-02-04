
package occurences;




public class Occurences {


    
    public static void main(String[] args) {
 
      
       char[] letters = {'A', 'A', 'B', 'C', 'D', 'E','E','E','E'};
       int count = countOccurrences(letters, 'A');
            System.out.println(count);
    }
    
    public static int countOccurrences(char[] leters, char searchLetter){
        int count = 0;
        char[] letters = null;
        for(char letter : letters){
        if(letter == searchLetter){
        count++;
        }
        }
        return count;
    
    }
         
        
    
  
}

  /*
    System.out.println(Arrays.toString(numbers));
        System.out.println( searchNumbers);
    */
      // number of occurrences that will count the occurences
        //  for any goven number