public class Main {
    public static void main(String[] args) {
        DynamicArray<String> arr = new DynamicArray<>(3);

        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.add("F");
        arr.add("G");

        System.out.println(arr);

        // --- Information ---
        System.out.println("size: " + arr.getSize());
        System.out.println("capacity: " + arr.getCapacity());
        System.out.println("empty: " + arr.isEmpty());
    }
}