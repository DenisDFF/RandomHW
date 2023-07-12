public class MyStack<T> {
    private Object[] array;
    private int size;

    public MyStack() {
        array = new Object[10];
        size = 0;
    }

    public void push(T value) {
        if (size == array.length) {
            resizeArray();
        }
        array[size] = value;
        size++;
    }

    public T peek() {
        if (size == 0) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) array[size - 1];
    }

    public T pop() {
        if (size == 0) {
            throw new RuntimeException("Stack is empty");
        }
        T element = (T) array[size - 1];
        array[size - 1] = null;
        size--;
        return element;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    private void resizeArray() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}