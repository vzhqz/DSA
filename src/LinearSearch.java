// Linear search algorithm. O(n) time complexity
public class LinearSearch {
    // --- ONLY ACCEPTS WRAPPER CLASSES (for more versatility) ---
    public static int search(Object[] array, Object value) {
        // Loop through the array starting from index 0 all the way to the last index (array.length)
        for(int i = 0; i < array.length; i++) {
            // We are checking every index if it matches the value we are looking for
            if(array[i].equals(value)) {
                // If the index value matches our specified value, return the index of that value
                return i;
            }
        }
        // If we didn't find the value we were looking for, return the integer -1
        return -1;
    }
}

