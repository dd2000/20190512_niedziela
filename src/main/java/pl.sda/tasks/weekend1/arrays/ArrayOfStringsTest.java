package pl.sda.tasks.weekend1.arrays;

import java.util.Arrays;

public class ArrayOfStringsTest {
    public static void main(String[] args) {
        ArrayOfStrings arrayOfStrings = new ArrayOfStrings(5);
        arrayOfStrings.add("Chleb");
        arrayOfStrings.add("Woda");
        arrayOfStrings.add("Ser");
        arrayOfStrings.add("Szynka");
        arrayOfStrings.add("Ogórek");
        arrayOfStrings.add("Masło");

        System.out.println("first element = " + arrayOfStrings.getElement(0));
        System.out.println("third element = " + arrayOfStrings.getElement(2));
        System.out.println("all elements = " + Arrays.toString(arrayOfStrings.getElements()));
        System.out.println("reversed elements = " + Arrays.toString(arrayOfStrings.getReversedElements()));
        System.out.println("sorted elements = " + Arrays.toString(arrayOfStrings.getSortedElements()));
        System.out.println("min element = " + arrayOfStrings.getMinElement());
        System.out.println("max element = " + arrayOfStrings.getMaxElement());
    }
}
