

public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        DynamicArray<String> array = new DynamicArray<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println(stack);

        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");

        System.out.println(array);
    }
}