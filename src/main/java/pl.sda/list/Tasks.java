package pl.sda.list;

import com.google.common.collect.Lists;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {
        //#1
        listOfIntegers();

        //#2
        //List<String> list1 = Lists.newArrayList("apple", "pear", "plum");
        //List<String> list2 = Lists.newArrayList("orange", "pear");
        //List<String> list3 = Lists.newArrayList("lemon", "peach", "cherry", "apple");
        //List<String> fruits = merge(list1, list2, list3);
        //System.   out.println("fruits = " + fruits);

        //#3
        //List<Double> numbers = Lists.newArrayList(3.5, 0.5, 3.1, 7., 0.9);
        //List<Double> sortedNumbers = selectionSort(numbers);
        //System.out.println("sortedNumbers = " + sortedNumbers);

        //#4
        //List<String> strings = Lists.newArrayList("ford", "lion", "orange", "adam", "julia", "elephant");
        //boolean isLionFound = binarySearch(strings, "lion");
        //boolean isCatFound = binarySearch(strings, "cat");
        //System.out.println("isLionFound = " + isLionFound);
        //System.out.println("isCatFound = " + isCatFound);

        //#5
        //List<Product> products = Lists.newArrayList(
        //                                new Product(1, "SmartTV", 1999.99),
        //                                new Product(2, "Laptop HD", 1500.55),
        //                                new Product(3, "Pencil", 15.59),
        //                                new Product(4, "SmartWatch", 999.05),
        //                                new Product(5, "Pen", 15.59),
        //                                new Product(6, "Laptop FullHD", 1500.55)
        //                                );
        //products = sortProducts(products);
        //System.out.println("products sorted:");
        //products.forEach(System.out::println);
    }

    /**
     * 1. Stwórz listę obiektów typu Integer. Wypisz na ekran pierwszy, środkowy i ostatni element listy.
     * Następnie wypisz na ekran co drugą liczbę z listy.
     */
    private static void listOfIntegers() {
        List<Integer> cities = new ArrayList<>();
        cities.add(1);
        cities.add(2);
        cities.add(3);
        cities.add(4);
        cities.add(5);

        List<Integer> cities2 = Lists.newArrayList(11, 12, 13, 14, 15);

        //List<Integer> cities2 = Arrays.asList(5,6,7,8,9);
        //cities2.add(8);
        int first = cities2.get(0);
        int middleIndex = (cities2.size() / 2) - 1;
        if (cities2.size() %2 !=0) {
            middleIndex++;
        }
        int last = cities2.get(cities2.size()-1);
        int middle = cities2.get(middleIndex);
        System.out.println(first);
        System.out.println(middle);
        System.out.println(last);
    }

    /**
     * 2. Napisz metodę która połączy wszystkie element 3 list w jedną listę, która ma być zwrócona z metody.
     * Zwrócona lista nie powinna zawierać duplikatów.
     */
    private static List<String> merge(List<String> list1, List<String> list2, List<String> list3) {
        List<String> result = new ArrayList<>(list1);

        list2.removeAll(result);
        result.addAll(list2);

        list3.removeAll(result);
        result.addAll(list3);

        return result;
    }

    /**
     * 3. Posortuj podane liczby bez użycia metod z klasy Collection - za pomocą algorytmu sortowanie przez wybieranie
     */
    private static List<Double> selectionSort(List<Double> numbers) {
        List<Double> result = new ArrayList<>(numbers);

        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                if(result.get(i) > result.get(j)) {
                    double tmp = result.get(i);
                    result.set(i, result.get(j));
                    result.set(j, tmp);
                }
            }
        }

        return result;
    }

    /**
     * 4. Napisz metodę, która wyszuka podany element w liście i zwróci true jeżęli element zostanie znaleziony, false - w przeciwnym przypadku
     */
    private static boolean binarySearch(List<String> strings, String searchedPhrase) {
        //wyszukiwanie binarne działa tylko na posortowanych kolekcjach
        Collections.sort(strings);

        int start = 0;
        int end = strings.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            String midElement = strings.get(mid);
            if(midElement.equals(searchedPhrase)) {
                return true;
            } else if (midElement.compareTo(searchedPhrase) > 0) {
                end = mid - 1;
            } else if (midElement.compareTo(searchedPhrase) < 0) {
                start = mid + 1;
            }
        }

        return false;
    }

    /**
     * 5*. Posortuje listę produktów po cenie rosnąco i po nazwie rosnąco. Zwróć posortowaną listę.
     */
    private static List<Product> sortProducts(List<Product> products) {
        List<Product> sorted = new ArrayList<>(products);
        Collections.sort(sorted, Comparator.comparing(Product::getPrice).thenComparing(Product::getName));
        return sorted;
    }
}