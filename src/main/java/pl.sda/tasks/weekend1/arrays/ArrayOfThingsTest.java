package pl.sda.tasks.weekend1.arrays;

import java.util.Arrays;

public class ArrayOfThingsTest {
    public static void main(String[] args) {
        ArrayOfThings<String> arrayOfFoods = new ArrayOfThings<>(5);
        arrayOfFoods.add("Chleb");
        arrayOfFoods.add("Woda");
        arrayOfFoods.add("Ser");
        arrayOfFoods.add("Szynka");
        arrayOfFoods.add("Ogórek");
        arrayOfFoods.add("Masło");

        System.out.println("first element = " + arrayOfFoods.getElement(0));
        System.out.println("third element = " + arrayOfFoods.getElement(3));
        System.out.println("all elements = " + Arrays.toString(arrayOfFoods.getElements()));
        System.out.println("reversed elements = " + Arrays.toString(arrayOfFoods.getReversedElements()));
        System.out.println("sorted elements = " + Arrays.toString(arrayOfFoods.getSortedElements()));
        System.out.println("min element = " + arrayOfFoods.getMinElement());
        System.out.println("max element = " + arrayOfFoods.getMaxElement());

        ArrayOfThings<Double> arrayOfNumbers = new ArrayOfThings<>(5);
        arrayOfNumbers.add(5.5);
        arrayOfNumbers.add(1.1);
        arrayOfNumbers.add(5.);
        arrayOfNumbers.add(77.3);
        arrayOfNumbers.add(-7.3);
        arrayOfNumbers.add(-0.6);

        System.out.println("first element = " + arrayOfNumbers.getElement(0));
        System.out.println("third element = " + arrayOfNumbers.getElement(3));
        System.out.println("all elements = " + Arrays.toString(arrayOfNumbers.getElements()));
        System.out.println("reversed elements = " + Arrays.toString(arrayOfNumbers.getReversedElements()));
        System.out.println("sorted elements = " + Arrays.toString(arrayOfNumbers.getSortedElements()));
        System.out.println("min element = " + arrayOfNumbers.getMinElement());
        System.out.println("max element = " + arrayOfNumbers.getMaxElement());
    }
}
