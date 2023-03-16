
package unsortfetch;
import java.util.*;

public class Unsortfetch {

    
    public static void main(String[] args) 
{
       
// Small array
        int[] SArray = new int[10];
        for (int i = 0; i < SArray.length; i++) {  
            SArray[i] = i;
        }
        
        // Unsorted fetch on small array
        int index = unsortedFetch(SArray, 5);
        System.out.println("Index of 5 in small array: " + index);
        
        // Medium array
        int[] MArray = new int[100];
        for (int j = 0; j < MArray.length; j++) {  
            MArray[j] = j;
        }
        
        // Unsorted fetch on medium array
        index = unsortedFetch(MArray, 50);
        System.out.println("Index of 50 in medium array: " + index);
        
        // Large array
        int[] LArray = new int[1000];
        for (int L = 0; L < LArray.length; L++) {  
            LArray[L] = L;
        }
        
        // Unsorted fetch on large array
        index = unsortedFetch(LArray, 500);
        System.out.println("Index of 500 in large array: " + index);
    }
    
    public static int unsortedFetch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}










 