public class MyStack {
    private Object[] array;
    private int size;
    private int top;

    public MyStack() {
        array = new Object[10];
        size = 0;
        top = -1;
    }

    public void push(Object value) {
        if (size == array.length) {
            resizeArray();
        }
        array[++top] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        for (int i = index; i < top; i++) {
            array[i] = array[i + 1];
        }
        array[top--] = null;
        size--;
    }

    public void clear() {
        for (int i = 0; i <= top; i++) {
            array[i] = null;
        }
        size = 0;
        top = -1;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return array[top];
    }

    public Object pop() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        Object value = array[top];
        array[top--] = null;
        size--;
        return value;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private void resizeArray() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i <= top; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}