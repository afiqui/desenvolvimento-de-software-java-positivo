package car;
public class Car {
    private int size;
    private String color;
    private String model;
    private String brand;
    private int year;
    private int price;

    public Car(int size, String color, String model, String brand, int year, int price) {
        this.size = size;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printCar() {
        System.out.println("Size: " + getSize());
        System.out.println("Color: " + getColor());
        System.out.println("Model: " + getModel());
        System.out.println("Brand: " + getBrand());
        System.out.println("Year: " + getYear());
        System.out.println("Price: " + getPrice());
    }

    
}
