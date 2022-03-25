package view;

import java.util.Scanner;

import car.Car;

public class RegisterCarView {

    //create empty constructor
    public RegisterCarView() {
    }
    public Car show(){
        this.printHeader();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the size of the car");
        int size = scanner.nextInt();
        System.out.println("Type the color of the car");
        String color = scanner.next();
        System.out.println("Type the model of the car");
        String model = scanner.next();
        System.out.println("Type the brand of the car");
        String brand = scanner.next();
        System.out.println("Type the year of the car");
        int year = scanner.nextInt();
        System.out.println("Type the price of the car");
        int price = scanner.nextInt();
        scanner.close();
        return new Car(size, color, model, brand, year, price);
        
    }

    private void printHeader() {
        System.out.println("Register Car");
        System.out.println("------------");
        System.out.println("");
    }
}
