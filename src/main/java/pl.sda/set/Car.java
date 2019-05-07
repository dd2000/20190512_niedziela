package pl.sda.set;

public class Car {
    private String vin;
    private String model;
    private int yearOfProduction;

    public Car(String vin, String model, int yearOfProduction) {
        this.vin = vin;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return vin != null ? vin.equals(car.vin) : car.vin == null;
    }

    @Override
    public int hashCode() {
        return vin != null ? vin.hashCode() : 0;
    }

    @Override
    public String toString() {
        return String.format("%s %d (vin:%s)", model, yearOfProduction, vin);
    }
}
