package pl.sda.arrays;

public class Car implements Comparable<Car>{
    private String brand;
    private int yearOfProduction;
    private int rating;

    public Car(String brand, int yearOfProduction, int rating) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.rating = rating;
    }

    @Override
    public int compareTo(Car o) {
        if (o == null){
            return 1;
        }
        if (brand.compareTo(o.brand) != 0){
            return brand.compareTo(o.brand);
        }

        return o.yearOfProduction - yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("%-12s (rating: %02d) - year of production: %d", brand, rating, yearOfProduction);
    }
}

