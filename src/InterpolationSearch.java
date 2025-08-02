/**
 * <h3>Interpolation Search Algorithm</h3>
 * <ul>
 *     <li>Average Time Complexity: <b>O(log(log(n)))</b></li>
 *     <li>Worst case Time Complexity: <b>O(n)</b></li>
 * </ul>
 */
public class InterpolationSearch {
    private InterpolationSearch() { throw new UnsupportedOperationException(); }

    /**
     * <p>The Interpolation Search Algorithm is an improvement over Binary Search Algorithm for uniformly distributed data.</p>
     * <p>The Interpolation Search Algorithm takes in a sorted array and a target value as arguments.</p>
     * <p>
     *     The algorithm works by "guessing" where a value might be:
     *     <ul>
     *         <li>"Guess" where the target value might be based on a probability formula.</li>
     *         <li>If the probability result is greater than the target, search area is narrowed down to the left side of the probe position.</li>
     *         <li>If the probability result is less than the target, search area is narrowed down to the right side of the probe position.</li>
     *         <li>Then a new guess is calculated.</li>
     *     </ul>
     *     This process continues until the target is found, or the range is empty.
     * </p>
     * <p><b>NOTE: The array must be sorted. Faster if uniformly distributed.</b></p>
     */

    // --- primitive data type (int)
    public static int search(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while(target >= array[low] && target <= array[high] && low <= high) {
            int probe = low + (high - low) * (target - array[low]) /
                    (array[high] - array[low]);

            // For debugging purposes. Remove later
            System.out.println("probe: " + probe);

            if(array[probe] == target) return probe;
            else if(array[probe] < target) low = probe + 1;
            else high = probe - 1;
        }
        return -1;
    }

    // --- primitive data type (double)
    public static int search(double[] array, double target) {
        int low = 0;
        int high = array.length - 1;

        while(target >= array[low] && target <= array[high] && low <= high) {
            int probe = low + (int)((high - low) * (target - array[low]) /
                    (array[high] - array[low]));

            // For debugging purposes. Remove later
            System.out.println("probe: " + probe);

            if(array[probe] == target) return probe;
            else if(array[probe] < target) low = probe + 1;
            else high = probe - 1;
        }
        return -1;
    }

}
