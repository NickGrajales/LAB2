
package binarysearch;
import java.util.*;

public class Binarysearch {

    
    public static void main(String[] args) 
{
// Small array
        int[] SArray = new int[10];
        for (int i = 0; i < SArray.length; i++) {  
            SArray[i] = i;
        }
        
        // Binary search on small array
        int indexS = binarySearch(SArray, 3);
        System.out.println("Index of 3 in small array: " + indexS);
        
        // Medium array
        int[] MArray = new int[100];
        for (int j = 0; j < MArray.length; j++) {  
            MArray[j] = j;
        }
        
        // Binary search on medium array
        int indexM = binarySearch(MArray, 50);
        System.out.println("Index of 50 in medium array: " + indexM);
        
        // Large array
        int[] LArray = new int[1000];
        for (int L = 0; L < LArray.length; L++) {  
            LArray[L] = L;
        }
        
        // Binary search on large array
        int indexL = binarySearch(LArray, 500);
        System.out.println("Index of 500 in large array: " + indexL);
    }
    
    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}





     
