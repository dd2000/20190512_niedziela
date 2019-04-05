package pl.sda.map;

public class Employee {
    private final String name;
    private final String surname;
    private final String pesel;
    private final double salary;

    public Employee(String name, String surname, String pesel, double salary) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return pesel != null ? pesel.equals(employee.pesel) : employee.pesel == null;
    }

    @Override
    public int hashCode() {
        return pesel != null ? pesel.hashCode() : 0;
    }
}