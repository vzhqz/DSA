/**
 * <h3>Binary Search Algorithm</h3>
 * <ul>
 *     <li>Time complexity: <b>O(log(n))</b></li>
 * </ul>
 */
public class BinarySearch {
    private BinarySearch() { throw new UnsupportedOperationException(); }

    /**
     * The Binary Search Algorithm takes in a sorted array and a target value as arguments.
     * <p>
     *     The algorithm works by repeatedly diving the search range in half:
     *     <ul>
     *         <li>Calculate the middle index of the current range.</li>
     *         <li>If the middle value equals the target, return the index</li>
     *         <li>If the middle value is less than the target, search the right half.</li>
     *         <li>If the middle value is greater than the target, search the left half.</li>
     *     </ul>
     *     This process continues until the target is found or the range is empty.
     * </p>
     * <p><b>Note: the array must be sorted in ascending order.</b></p>
     */

    // --- primitive data type (int) ---
    public static int search(int[] array, int target) {
        int low = 0;
        int high = array.length;

        while(low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle;
        }
        return -1;
    }

    // --- primitive data type (double) ---
    public static int search(double[] array, double target) {
        int low = 0;
        int high = array.length;

        while(low <= high) {
            int middle = low + (high - low) / 2;
            double value = array[middle];

            if(value < target) low = middle + 1;
            else if(value > target) low = middle - 1;
            else return middle;
        }
        return -1;
    }

    // --- String data type ---
    public static int search(String[] array, String target) {
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int middle = low + (high - low) / 2;
            String value = array[middle];

            if(value.compareToIgnoreCase(target) < 0) low = middle + 1;
            else if(value.compareToIgnoreCase(target) > 0) high = middle - 1;
            else return middle;
        }
        return -1;
    }
}