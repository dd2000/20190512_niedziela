package pl.sda.tasks.weekend1.lists;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
        List<Double> numbers = Lists.newArrayList(3.5, 0.5, 3.1, 7., 0.9);
        List<Double> sortedNumbers = selectionSort(numbers);
        System.out.println("sortedNumbers = " + sortedNumbers);

        List<Character> characters = Lists.newArrayList('z', 'b', 'a', 'h', 'e');
        List<Character> sortedCharacters = selectionSort(characters);
        System.out.println("sortedCharacters = " + sortedCharacters);

        boolean isNumber1Found = binarySearch(numbers, 7.);
        boolean isNumber2Found = binarySearch(numbers, 5.1);
        System.out.println("isNumber1Found = " + isNumber1Found);
        System.out.println("isNumber2Found = " + isNumber2Found);

        boolean isHFound = binarySearch(characters, 'h');
        boolean isKFound = binarySearch(characters, 'k');
        System.out.println("isHFound = " + isHFound);
        System.out.println("isKFound = " + isKFound);
    }

    /**
     * 5. Zmień metodę (w klasie {@link pl.sda.list.Tasks}) do sortowania przez wybieranie tak żeby przyjmowała
     *    listę dowolnych obiektów (wystarczy że będą implementować klasę Comparable)
     */
    private static <E extends Comparable> List<E> selectionSort(List<E> numbers) {
        List<E> result = new ArrayList<>(numbers);

        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                E elementToSort = result.get(i);
                E watchedElement = result.get(j);
                if(elementToSort.compareTo(watchedElement) > 0) {
                    result.set(i, watchedElement);
                    result.set(j, elementToSort);
                }
            }
        }

        return result;
    }

    /**
     * 6. Zmień metodę do szukania binarnego tak żeby przyjmowała listę dowolnych obiektów (wystarczy że będą implementować klasę Comparable)
     */
    private static  <E extends Comparable> boolean binarySearch(List<E> elements, E searchedElement) {
        //wyszukiwanie binarne działa tylko na posortowanych kolekcjach
        Collections.sort(elements);

        int start = 0;
        int end = elements.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            E midElement = elements.get(mid);
            if(midElement.equals(searchedElement)) {
                return true;
            } else if (midElement.compareTo(searchedElement) > 0) {
                end = mid - 1;
            } else if (midElement.compareTo(searchedElement) < 0) {
                start = mid + 1;
            }
        }

        return false;
    }
}
