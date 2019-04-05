package pl.sda.list;

import java.util.List;

public class Tasks {

    public static void main(String[] args) {
        //#1
        listOfIntegers();

        //#2
        //List<String> list1 = Lists.newArrayList("apple", "pear", "plum");
        //List<String> list2 = Lists.newArrayList("orange", "pear");
        //List<String> list3 = Lists.newArrayList("lemon", "peach", "cherry", "apple");
        //List<String> fruits = merge(list1, list2, list3);
        //System.out.println("fruits = " + fruits);

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
     * 1. Stwórz listę obiektów typu Integer. Wypisz na ekran pierwszy, środokowy i ostatni element listy.
     * Następnie wypisz na ekran co drugą liczbę z listy.
     */
    private static void listOfIntegers() {
    }

    /**
     * 2. Napisz metodę która połączy wszystkie element 3 list w jedną listę, która ma być zwrócona z metody.
     *    Zwrócona lista nie powinna zawierać duplikatów.
     */
    private static List<String> merge(List<String> list1, List<String> list2, List<String> list3) {
        return null;
    }

    /**
     * 3. Posortuj podane liczby bez użycia metod z klasy Collection - za pomocą algorytmu sortowanie przez wybieranie
     */
    private static List<Double> selectionSort(List<Double> numbers) {
        return null;
    }

    /**
     * 4. Napisz metodę, która wyszuka podany element w liście i zwróci true jeżęli element zostanie znaleziony, false - w przeciwnym przypadku
     */
    private static boolean binarySearch(List<String> strings, String searchedPhrase) {
        return false;
    }

    /**
     * 5*. Posortuje listę produktów po cenie rosnąco i po nazwie rosnąco. Zwróć posortowaną listę.
     */
    private static List<Product> sortProducts(List<Product> products) {
        return null;
    }
}