package pl.sda.set;

public class Citizen implements Comparable<Citizen>{
    private final String name;
    private final String surname;
    private final String pesel;

    public Citizen(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return String.format("%s %s (pesel:%s)",name, surname,  pesel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Citizen citizen = (Citizen) o;

        return pesel != null ? pesel.equals(citizen.pesel) : citizen.pesel == null;
    }

    @Override
    public int hashCode() {
        return pesel != null ? pesel.hashCode() : 0;
    }

    @Override
    public int compareTo(Citizen o) {
        if (o ==null){ return -1;}

        if (surname.compareTo(o.surname)!= 0){
            return surname.compareTo(o.surname);
        }
        return name.compareTo(o.name);
    }
}