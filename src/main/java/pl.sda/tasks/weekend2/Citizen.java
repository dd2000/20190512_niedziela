package pl.sda.tasks.weekend2;

public class Citizen {
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
}