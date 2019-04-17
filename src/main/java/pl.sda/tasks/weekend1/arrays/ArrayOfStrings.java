package pl.sda.tasks.weekend1.arrays;

import java.util.Arrays;

/**
 * 1. Stwórz klasę, która będzie przechowywać tablicę Stringów. W konstruktorze należy podać rozmiar tablicy.
 *    Dodaj metody:
 *      - do dodawania elementów - w przypadku gdy tablica nie pomieści więcej elementów metoda powinna wyrzucić wyjątek.
 *      - pobierania elementów tablicy pojedynczych po indexie
 *      - pobierania wszystkich elementów.
 */
public class ArrayOfStrings {
    private String[] strings;
    private int indexOfLastElement;

    public ArrayOfStrings(int length) {
        if(length <= 0) {
            throw new IllegalArgumentException("length must be > 0!");
        }

        this.strings = new String[length];
        indexOfLastElement = -1;
    }

    public String[] getElements() {
        return copy(strings, indexOfLastElement + 1);
    }

    public String getElement(int index) {
        if(index < 0 || index > indexOfLastElement) {
            throw new IllegalArgumentException("Element not exists, index: " + index);
        }

        return strings[index];
    }

    /*public ArrayOfStrings add(String element) {
        indexOfLastElement++;
        if(indexOfLastElement == strings.length) {
            throw new IllegalStateException("can't add another element - array is full!");
        }

        strings[indexOfLastElement] = element;
        return this;
    }*/

    /**
     * 2. Wykorzystując metodę Tasks.addElementToArray() z projektu java_pro1 - dodaj do klasy z pkt 1 możliwość powiększania tablicy w przypadku gdy nowe elementy nie mieszczą się w niej.
     */
    public ArrayOfStrings add(String element) {
        indexOfLastElement++;
        if(indexOfLastElement == strings.length) {
            strings = copy(strings, strings.length * 2);
        }

        strings[indexOfLastElement] = element;
        return this;
    }

    /**
     * 3. Dodaj do klasy z pkt 1 metody, które zwrócą:
     *   - kopię tablicy, ale z odwróconą kolejnością elementów
     */
    public String[] getReversedElements() {
        if(strings.length == 1) {
            return strings;
        }

        int length = indexOfLastElement + 1;
        String[] reversed = new String[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = strings[length - i - 1];
        }

        return reversed;
    }

    /**
     *  - kopię tablicy z posortowanymi elementami
     */
    public String[] getSortedElements() {
        if(strings.length == 1) {
            return strings;
        }

        String[] copy = copy(strings, indexOfLastElement + 1);
        Arrays.sort(copy);

        return copy;
    }

    /**
     *   - najmniejszy element tablicy
     */
    public String getMinElement() {
        return getSortedElements()[0];
    }

    /**
     *   - największu element tablicy
     */
    public String getMaxElement() {
        String[] sortedElements = getSortedElements();
        return sortedElements[sortedElements.length - 1];
    }

    private String[] copy(String[] words, int length) {
        //System.out.println("copy array");
        String[] newWords = new String[length];
        int min = Math.min(words.length, length);
        for (int i = 0; i < min; i++) {
            newWords[i] = words[i];
        }

        return newWords;
    }
}