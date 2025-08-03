/**
 * <h3>Bubble Sort Algorithm</h3>
 * <ul>
 *     <li>Time Complexity: <b>O(n^2)</b></li>
 * </ul>
 */
public class BubbleSort {
    private BubbleSort() { throw new UnsupportedOperationException(); }

    /**
     *
     * The Bubble Sort Algorithm works by comparing adjacent pair of elements:
     * <ul>
     *     <li>If the pairs are in order, if not, the elements are swapped.</li>
     *     <li>This goes on until all the elements are in order and the array is sorted.</li>
     * </ul>
     *
     * <p>This sorting algorithm is fine for smaller data sets, but bad for large data sets.</p>
     */

    // --- primitive data type (int) ---
    public static void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i -1; j++) {
                if(array[j] > array[j + 1]) {
                    // swap the two indexes
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // --- primitive data type (double) ---
    public static void sort(double[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i -1; j++) {
                if(array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // --- string data type ---
    public static void sort(String[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
