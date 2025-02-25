import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

/**
 * Union of Two Arrays Implementation
 * Time Complexity: O(nlogn) - where n is total number of elements in both arrays
 *                  - O(n) for adding elements to HashSet
 *                  - O(nlogn) for sorting the final ArrayList
 * Space Complexity: O(n) - where n is total unique elements stored in HashSet/ArrayList
 */
public class Problem8 {
    /**
     * Finds union of two arrays and returns sorted result
     * @param a First input array
     * @param b Second input array 
     * @return Sorted ArrayList containing union of both arrays
     */
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // Use HashSet to automatically handle duplicates
        Set<Integer> set = new HashSet<Integer>();
        
        // Add all elements from first array
        for(int i: a){
            set.add(i);
        }
        
        // Add all elements from second array
        // Duplicates will be automatically ignored by HashSet
        for(int j: b){
            set.add(j);
        }
        
        // Convert set to ArrayList for sorting
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        
        // Sort the list in ascending order
        Collections.sort(list);
        
        return list;
    }
}
