package pl.sda.stack.arraystack;

public class Stack<T> {
    private Object[] arr = new Object[10];
    private int index = -1;

    public void push(T value) {
        index++;
        if (index == arr.length) {
            extend();
        }
        arr[index] = value;
    }

    public T peek() throws Exception {
        if (index == -1) {
            throw new Exception("Stack is empty!");
        }
        return (T) arr[index];
    }

    public T pop() throws Exception {
        if (index == -1) {
            throw new Exception("Stack is empty!");
        }
        T result = (T) arr[index];
        arr[index] = null;
        index--;
        return result;
    }

    public boolean isEmpty() {
        return index == -1;
    }

    private void extend() {
        Object[] temp = arr;
        arr = new Object[temp.length * 2];
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }
}
