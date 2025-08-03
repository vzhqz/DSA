/**
 * <h3>Selection Sort Algorithm</h3>
 * <ul>
 *     <li>Time Complexity: <b>O(n^2)</b></li>
 * </ul>
 */
public class SelectionSort {
    private SelectionSort() { throw new UnsupportedOperationException(); }

    /**
     * <h5>The Selection Sort Algorithm works by:</h5>
     * <ol>
     *     <li>Declaring an initial minimum value</li>
     *     <li>Comparing each element to the minimum value</li>
     *     <li>If the minimum value is bigger than a certain element, declare that element as a new min, and swap the 2 elements position.</li>
     *     <li>Otherwise, keep comparing</li>
     *     <li>Repeat this process until the array is fully sorted</li>
     * </ol>
     *
     * <p><b>Note: The larger the dataset, the more inefficient this algorithm is going to be.</b></p>
     */

    // --- primitive data type (int) ---
    public static void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            // declare an initial min value
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                // if our min value is bigger than the pair adjacent to it
                if(array[min] > array[j]) {
                    // declare a new min value
                    min = j;
                }
            }
            // swap the old min with the new min
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    // --- primitive data type (double) ---
    public static void sort(double[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            // declare an initial min value
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                // if our min value is bigger than the pair adjacent to it
                if(array[min] > array[j]) {
                    // declare a new min value
                    min = j;
                }
            }
            // swap the old min with the new min
            double temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    // --- string data type ---
    public static void sort(String[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            // declare an initial min value
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                // if our min value is bigger than the pair adjacent to it
                if(array[min].compareToIgnoreCase(array[j]) > 0) {
                    // declare a new min value
                    min = j;
                }
            }
            // swap the old min with the new min
            String temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
