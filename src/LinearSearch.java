/**
 * <h3>Linear Search Algorithm</h3>
 * <ul>
 *     <li>Time Complexity: <b>O(n)</b></li>
 * </ul>
 */
public class LinearSearch {
    private LinearSearch() { throw new UnsupportedOperationException(); };

    /**
     * The Linear Search Algorithm takes in an array and a target value as arguments.
     * <p>
     *     The algorithm works by looping through the array:
     *     <ul>
     *         <li>Compare each element in the array to the target.</li>
     *         <li>If an element equals the target, return the index of the element</li>
     *         <li>If no element equals the target, return -1</li>
     *     </ul>
     * </p>
     * Note: The array doesn't have to be sorted in any order.
     */

    // --- primitive data type (int) ---
    public static int search(int[] array, int target) {
        for(int i = 0; i < array.length; i++) {
            // found at index i
            if(array[i] == target) return i;
        }
        // not found
        return -1;
    }

    // --- primitive data type (double) ---
    public static int search(double[] array, double target) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target) return i;
        }
        return -1;
    }

    // --- String data type ---
    public static int search(String[] array, String target) {
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(target)) return i;
        }
        return -1;
    }
}
