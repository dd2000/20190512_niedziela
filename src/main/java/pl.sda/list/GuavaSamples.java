package pl.sda.list;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

import java.util.*;

public class GuavaSamples {
    public static void main(String[] args) {
        //#1
        collections();

        //#2
        //strings();
    }

    private static void collections() {
        //tworzenie i wypełnianie list
        //zamiast
        List<String> namesList = new ArrayList<>();
        namesList.add("Adam");
        namesList.add("Henryk");
        namesList.add("Józek");
        namesList.add("Stasiek");

        //można szybciej
        List<String> guavaNamesList = Lists.newArrayList("Adam", "Henryk", "Józek", "Stasiek");
        for (String guavaName : guavaNamesList) {
            System.out.println("guavaName = " + guavaName);
        }

        System.out.println("---------------------");

        //tworzenie i wypełnianie setów
        //zamiast
        Set<String> namesSet = new HashSet<>();
        namesSet.add("Ania");
        namesSet.add("Ola");
        namesSet.add("Wiola");
        namesSet.add("Mariola");

        //można szybciej
        Set<String> guavaNamesSet = Sets.newHashSet("Ania", "Ola", "Wiola", "Mariola");
        for (String guavaName : guavaNamesSet) {
            System.out.println("guavaName = " + guavaName);
        }

        System.out.println("---------------------");

        //tworzenie i wypełnianie map gdzie wartość jest kolekcją
        //zamiast
        Map<String, Set<String>> mapOfStrings = new HashMap<>();
        Set<String> lowers = new HashSet<>();
        lowers.add("a");
        lowers.add("b");
        lowers.add("c");
        lowers.add("d");
        mapOfStrings.put("lower", lowers);

        Set<String> uppers = new HashSet<>();
        uppers.add("A");
        uppers.add("B");
        uppers.add("C");
        uppers.add("D");
        mapOfStrings.put("upper", uppers);

        System.out.println("mapOfStrings size = " + mapOfStrings.size());
        System.out.println("mapOfStrings values = " + mapOfStrings.values());

        //można szybciej
        Multimap<String,String> guavaMapOfStrings = ArrayListMultimap.create();

        guavaMapOfStrings.put("lower", "a");
        guavaMapOfStrings.put("lower", "b");
        guavaMapOfStrings.put("lower", "c");
        guavaMapOfStrings.put("lower", "d");

        guavaMapOfStrings.put("upper", "A");
        guavaMapOfStrings.put("upper", "B");
        guavaMapOfStrings.put("upper", "C");
        guavaMapOfStrings.put("upper", "D");

        //tego nie ma zwykła mapa
        System.out.println("guavaMapOfStrings.containsEntry(lower, a) = " + guavaMapOfStrings.containsEntry("lower", "a"));
        System.out.println("guavaMapOfStrings values = " + guavaMapOfStrings.values());
        System.out.println("guavaMapOfStrings size = " + guavaMapOfStrings.size());
    }

    private static void strings() {
        //sprawdzenie czy string jest pusty
        //zamiast
        String str = "nie-pusty";
        if(str != null && !str.isEmpty()) {
            System.out.println("emptyString = " + str);
        }

        //można łatwiej
        if(!Strings.isNullOrEmpty(str)) {
            System.out.println("emptyString = " + str);
        }

        //łaczenie kilku stringów w jeden
        String join = Joiner.on(", ")
                            .useForNull("NULL")
                            .join("Java", "C++", null, "Pascal", "PHP", " ");
        System.out.println("join = " + join);

        //dzielenie jednego stringa na kilka części
        Iterable<String> parts = Splitter.on(",")
                                         .trimResults()
                                         .omitEmptyStrings()
                                         //.limit(3)
                                         .split("Java, C++, Pascal, PHP");
        for (String part : parts) {
            System.out.println("part = " + part);
        }
    }
}
