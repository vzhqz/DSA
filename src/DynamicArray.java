public class DynamicArray<T> {
    private int size;
    private int capacity = 10;
    T[] array;

    // --- Constructors ---
    public DynamicArray() {
        this.array = (T[]) new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    // --- Getter methods ---
    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    // --- Array methods ---
    public void add(T data) {
        if(size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, T data) {
        if(size >= capacity) {
            grow();
        }
        for(int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void deleteFirst(T data) {
        for(int i = 0; i < size; i++) {
            if(array[i].equals(data)) {
                for(int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size <= (capacity / 3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public void deleteAll(T data) {
        int i = 0;
        while(i < size) {
            if(array[i].equals(data)) {
                for(int j = i; j < size; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size <= (capacity / 3)) {
                    shrink();
                }
            }
            else {
                i++;
            }
        }
    }


    public void deleteAt(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        for(int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        if(size <= (capacity / 3)) {
            shrink();
        }
    }

    public void replaceAt(int index, T newData) {
        array[index] = newData;
        array[size - 1] = null;
        size--;
        if(size <= (capacity / 3)) {
            shrink();
        }
    }

    public void replaceAll(T oldData, T newData) {
        for(int i = 0; i < size; i++) {
            if(array[i].equals(oldData)) {
                array[i] = newData;
            }
        }
    }

    public int search(T data) {
        for(int i = 0; i < size; i++) {
            if(array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public T get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        return array[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }


    private void grow() {
        int newCapacity = capacity * 2;
        T[] newArray = (T[]) new Object[newCapacity];

        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {
        int newCapacity = (int) capacity / 2;
        T[] newArray = (T[]) new Object[newCapacity];

        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    // --- Overriding the toString method ---
    @Override
    public String toString() {
        String string = "";
        for(int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }
        if(!string.isEmpty()) {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }
        return string;
    }
}
