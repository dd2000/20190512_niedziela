package pl.sda.tasks.weekend2;

public class CitizenListTest {
    public static void main(String[] args) {
        CitizenList citizenList = new CitizenList();
        citizenList.add(new Citizen("Ewa", "Młoda", "781204"));
        citizenList.add(new Citizen("Marek", "Rem", "811104"));
        citizenList.add(new Citizen("Zuza", "Oko", "911004"));
        Citizen toDelete = new Citizen("Łukasz", "Nawrot", "20110712");
        citizenList.add(toDelete);
        citizenList.add(new Citizen("Adam", "Raz", "93030405"));

        System.out.println("Citizens list:");
        for (Citizen citizen : citizenList) {
            System.out.println("citizen = " + citizen);
        }

        citizenList.remove(toDelete);
        System.out.println("\nCitizens list(after deletion):");
        for (Citizen citizen : citizenList) {
            System.out.println("citizen = " + citizen);
        }

        System.out.println("\nCitizens list(reversed):");
        for (Citizen citizen : citizenList.reversed()) {
            System.out.println("citizen = " + citizen);
        }
    }
}
