package pl.sda.tasks.weekend1.arrays;

import java.util.Arrays;

/**
 * 4. Zmień klasę z pkt 1 tak żeby mogła przechowywać dowolne elementy - jedyny warunek jest taki że muszą implementować interfejs Comparable
 */
public class ArrayOfThings<E extends Comparable> {
    private E[] elements;
    private int indexOfLastElement;

    @SuppressWarnings("unchecked")
    public ArrayOfThings(int length) {
        if(length <= 0) {
            throw new IllegalArgumentException("length must be > 0!");
        }

        elements = (E[]) new Comparable[length];
        indexOfLastElement = -1;
    }

    public E[] getElements() {
        return copy(elements, indexOfLastElement + 1);
    }

    public E getElement(int index) {
        if(index < 0 || index > indexOfLastElement) {
            throw new IllegalArgumentException("Element not exists, index: " + index);
        }

        return elements[index];
    }

    public ArrayOfThings add(E element) {
        indexOfLastElement++;
        if(indexOfLastElement == elements.length) {
            elements = copy(elements, elements.length * 2);
        }

        elements[indexOfLastElement] = element;
        return this;
    }

    public E[] getReversedElements() {
        if(elements.length == 1) {
            return elements;
        }

        int length = indexOfLastElement + 1;
        Comparable[] reversed = new Comparable[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = elements[length - i - 1];
        }

        @SuppressWarnings("unchecked")
        E[] reversedCasted = (E[]) reversed;
        return reversedCasted;
    }

    public E[] getSortedElements() {
        if(elements.length == 1) {
            return elements;
        }

        E[] copy = copy(elements, indexOfLastElement + 1);
        Arrays.sort(copy);

        return copy;
    }

    public E getMinElement() {
        return getSortedElements()[0];
    }

    public E getMaxElement() {
        return getSortedElements()[indexOfLastElement];
    }

    private E[] copy(E[] words, int length) {
        return Arrays.copyOf(words, length);
    }
}