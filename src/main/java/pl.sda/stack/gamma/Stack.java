package pl.sda.stack.gamma;

import java.util.Arrays;

public class Stack<T> {
    private int size = 10;
    private Object[] arr = new Object[size];
    private int index = -1;

    public void push(T element) {
        index++;
        if (index == size - 1) {
            size = size * 2;
            arr = Arrays.copyOf(arr, size);
        }
        arr[index] = element;
    }

    public T pop() {
        if (index < 0) {
            return null;
        }
        T value = (T) arr[index];
        arr[index] = 0;
        index--;
        return value;
    }

    public T peek() {
        if (index < 0) {
            return null;
        }
        return (T) arr[index];
    }

    public boolean isEmpty() {
        return index < 0;
    }
}
