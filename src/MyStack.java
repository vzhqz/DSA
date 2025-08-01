import java.util.EmptyStackException;

@SuppressWarnings({"unused", "unchecked"})
public class MyStack<T> {
    private int size;
    private int initialCapacity = 4;
    private T[] stack;

    // --- Constructor ---
    public MyStack() {
        this.stack = (T[]) new Object[initialCapacity];
    }

    // --- Get size method ---
    public int getSize() {
        return size;
    }

    // --- Stack Methods ---
    public void push(T data) {
        if(size >= initialCapacity) {
            grow();
        }
        stack[size] = data;
        size++;
    }

    public T pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        T item = stack[size - 1];
        stack[size - 1] = null;
        size--;
        if((initialCapacity > 4) && (size <= (int) (initialCapacity / 4))) {
            shrink();
        }
        return item;
    }

    public T peek() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        return stack[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void grow() {
        int newInitialCapacity = initialCapacity * 2;
        T[] newStack = (T[]) new Object[newInitialCapacity];
        for(int i = 0; i < size; i++) {
            newStack[i] = stack[i];
        }
        initialCapacity = newInitialCapacity;
        stack = newStack;
    }

    private void shrink() {
        int newInitialCapacity = initialCapacity / 2;
        T[] newStack = (T[]) new Object[newInitialCapacity];
        for(int i = 0; i < size; i++) {
            newStack[i] = stack[i];
        }
        initialCapacity = newInitialCapacity;
        stack = newStack;
    }

    // -- Overriding the toString() method ---
    @Override
    public String toString() {
        if(isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for(int i = size - 1; i >= 0; i--) {
            sb.append(stack[i]);
            if(i > 0) sb.append(", ");
        }
        sb.append("]");

        return sb.toString();
    }
}
