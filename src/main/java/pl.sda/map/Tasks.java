package pl.sda.map;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {
        //#1
        Employee employee1 = new Employee("Jan", "Kowalski", "A1234", 2999.99);
        Employee employee2 = new Employee("Marian", "Zet", "Z4556", 3200);
        Employee employee3 = new Employee("Jan", "Kowalski", "A1234", 1000.99);
        Employee employee4 = new Employee("Adam", "Adamus", "A6711", 3500.99);
        Employee employee5 = new Employee("Mietek", "Babka", "BH776", 1900.55);
        Employee employee6 = new Employee("Jurek", "Bruzda", "JJ779", 1100);
        Employee employee7 = new Employee("Wiesław", "Bruzda", "WW770", 4100);
        Employee employee8 = new Employee("Ania", "Bruzda", "JJ722", 1100);
        Map<String, Employee> employeeMap = mapOfEmployees(employee1, employee2, employee3, employee4, employee5, employee6, employee7);
        //printMap("employeeMap:", employeeMap);

        //#2
//        TreeMap<String, Employee> treeMapOfEmployees = treeMapOfEmployees(employeeMap);
//        printMap("\ntreeMapOfEmployees:", treeMapOfEmployees);

        //#3
        TreeMap<Double, List<Employee>> treeMapOfEmployeesSalary = treeMapOfEmployeesSalary(employee1, employee2, employee4, employee5, employee6, employee7, employee8);
        printMap("\ntreeMapOfEmployeesSalary:", treeMapOfEmployeesSalary);

        //#4
        //Map<String, Collection<Employee>> dividedBySalary = divideBySalary(treeMapOfEmployeesSalary);
        //printMap("\ndividedBySalary:", dividedBySalary);
    }

    /**
     * 1. Z podanej tablicy obiektów klasy Employee stwórz mapę (HashMap), która jako klucz będzie zawierała nazwisko i imię pracownika,
     *    a jako klucz obiekt klasy Employee. Zwróc mapę z metody.
     */
    private static Map<String, Employee> mapOfEmployees(Employee... employees) {
        Map<String, Employee> employeeMap = new HashMap<>();
        for (Employee employee : employees) {
            String name = employee.getSurname() + " " + employee.getName();
            employeeMap.put(name, employee);
        }
        return employeeMap;
    }

    /**
     * 2. Dla podanej mapy stwórz mapę gdzie klucze będą posortowane w kolejności malejącej.
     *    Wyświetl wszyskich pracowników których nazwiska zaczynają się na: B i A.
     *    Zwróć cała posortowaną mapę z metody.
     */
    private static TreeMap<String, Employee> treeMapOfEmployees(Map<String, Employee> employeeMap) {
        TreeMap<String, Employee> treeMap = new TreeMap<>((s1, s2) -> -s1.compareTo(s2));
        treeMap.putAll(employeeMap);

        printMap("Tylko A i B ",treeMap.subMap("C","A"));


        return treeMap;
    }

    /**
     * 3. Z podanej tablicy obiektów klasy Employee stwórz mapę która jako klucz będzie zawierała zarobki pracownika,
     *    a jako klucze obiekty klasy Employee. Mapa powinna być posortowana w naturalnym porządku.
     *    Wypisz pracownika z najniższymi i najwyższymi zarobkami - korzystając z metod mapy.
     *    Zwróc mapę z metody.
     */
    private static TreeMap<Double, List<Employee>> treeMapOfEmployeesSalary(Employee... employees) {

        TreeMap<Double, List<Employee>> employeeTreeMap = new TreeMap<>();

        for (Employee employee : employees) {
            double salary = employee.getSalary();
            if(!employeeTreeMap.containsKey(salary)) {
                employeeTreeMap.put(salary, new ArrayList<>());
            }
            employeeTreeMap.get(salary).add(employee);
        }
        System.out.println(employeeTreeMap.firstEntry().getValue());
        System.out.println(employeeTreeMap.get(employeeTreeMap.lastKey()));

        return employeeTreeMap;
    }

    /**
     * 4*. Za pomocą metod z klasy TreeMap podziel podaną mapę na trzy części:
     *     - zarobki poniżej 2000 zł
     *     - zarobki pomiędzy 2000-4000 zł
     *     - zarobki powyżej 4000 zł
     *     z podzielonych submap wyciągnij kolekcję pracowników i dodaj do mapy którą ma zwrócić metoda.
     *     Zwrócona mapa jako klucze ma zawierać opis przedziału zarobków, a jako wartość kolekcję pracowników dla danego przedziału
     */
    private static Map<String, Collection<Employee>> divideBySalary(TreeMap<Double, Employee> treeMapOfEmployeesSalary) {
        return null;
    }

    private static void printMap(String message, Map<?, ?> employeeMap) {
        if(employeeMap == null) {
            System.out.println("map is null!");
            return;
        }
        System.out.println(message);
        employeeMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}