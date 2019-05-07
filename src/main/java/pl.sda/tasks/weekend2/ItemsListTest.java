package pl.sda.tasks.weekend2;

public class ItemsListTest {
    public static void main(String[] args) {
        ItemsList<Citizen> citizens = new ItemsList<>();
        citizens.add(new Citizen("Ewa", "Młoda", "781204"));
        citizens.add(new Citizen("Marek", "Rem", "811104"));
        citizens.add(new Citizen("Zuza", "Oko", "911004"));
        Citizen toDelete = new Citizen("Łukasz", "Nawrot", "20110712");
        citizens.add(toDelete);
        citizens.add(new Citizen("Adam", "Raz", "93030405"));

        System.out.println("Citizens list:");
        for (Citizen citizen : citizens) {
            System.out.println("citizen = " + citizen);
        }

        citizens.remove(toDelete);
        System.out.println("\nCitizens list(after deletion):");
        for (Citizen citizen : citizens) {
            System.out.println("citizen = " + citizen);
        }

        System.out.println("\nCitizens list(reversed):");
        for (Citizen citizen : citizens.reversed()) {
            System.out.println("citizen = " + citizen);
        }

        System.out.println("\nCitizens list(only A):");
        for (Citizen citizen : citizens.conditionalIterable(citizen -> citizen.getName().startsWith("A"))) {
            System.out.println("citizen = " + citizen);
        }

        System.out.println("\n-------------------\n");

        ItemsList<Double> numbers = new ItemsList<>();
        numbers.add(10.4);
        numbers.add(4.1);
        numbers.add(1.9);
        Double numberToDelete = 0.8;
        numbers.add(numberToDelete);
        numbers.add(-0.8);

        System.out.println("Numbers list:");
        for (Double number : numbers) {
            System.out.println("number = " + number);
        }

        numbers.remove(numberToDelete);
        System.out.println("\nNumbers list(after deletion):");
        for (Double number : numbers) {
            System.out.println("number = " + number);
        }

        System.out.println("\nNumbers list(reversed):");
        for (Double number : numbers.reversed()) {
            System.out.println("number = " + number);
        }

        System.out.println("\nNumbers list(> 0):");
        for (Double number : numbers.conditionalIterable(number -> number > 0)) {
            System.out.println("number = " + number);
        }
    }
}
