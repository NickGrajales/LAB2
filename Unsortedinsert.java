
package unsortedinsert;
import java.util.*;

public class Unsortedinsert {

   
    public static void main(String[] args)
  {
      // Small array
        int[] SArray = new int[10];
        for (int i = 0; i < SArray.length; i++) {  
            SArray[i] = i;
        }
        
        // Unsorted insert on small array
        int[] SArrayInserted = unsortedInsert(SArray, 3, 100);
        System.out.println("Small array with 100 inserted at index 3: " + Arrays.toString(SArrayInserted));
        
        // Medium array
        int[] MArray = new int[100];
        for (int j = 0; j < MArray.length; j++) {  
            MArray[j] = j;
        }
        
        // Unsorted insert on medium array
        int[] MArrayInserted = unsortedInsert(MArray, 50, 200);
        System.out.println("Medium array with 200 inserted at index 50: " + Arrays.toString(MArrayInserted));
        
        // Large array
        int[] LArray = new int[1000];
        for (int L = 0; L < LArray.length; L++) {  
            LArray[L] = L;
        }
        
        // Unsorted insert on large array
        int[] LArrayInserted = unsortedInsert(LArray, 500, 300);
        System.out.println("Large array with 300 inserted at index 500: " + Arrays.toString(LArrayInserted));
    }
    
    public static int[] unsortedInsert(int[] array, int index, int value) {
        int[] newArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i+1] = array[i];
            }
        }
        newArray[index] = value;
        return newArray;
    }
}

 
 







 
 