package pl.sda.stack.alfa;

import java.util.Arrays;

public class Stack {
    int sizeArray = 10;
    int[] arr = new int[sizeArray];
    int index = -1;

    public void push(int element) {
        index++;
        if (index == sizeArray - 1) {
            sizeArray = sizeArray * 2;
            arr = Arrays.copyOf(arr, sizeArray);
        }
        arr[index] = element;
    }

    public Integer pop() {
        if (index < 0) {
            return null;
        }
        int value = arr[index];
        arr[index] = 0;
        index--;
        return value;
    }

    public Integer peek() {
        if (index < 0) {
            return null;
        }
        return arr[index];
    }

    public boolean isEmpty() {
        return index < 0;
    }
}
