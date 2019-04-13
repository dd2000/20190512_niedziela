package pl.sda.set;

public class Car {
    private String brand;
    private String color;
    private String vin;

    public Car(String brand, String color, String vin) {
        this.brand = brand;
        this.color = color;
        this.vin = vin;
    }

    public String getBrand() {
        return brand;

    }

    public String getColor() {
        return color;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", vin='" + vin + '\'' +
                '}';
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
}
