import java.util.LinkedList;
import car.Car;
import view.RegisterCarView;

public class App {

    //create array using linkedlist
    static LinkedList<Car> cars = new LinkedList<>();

    public static void main(String[] args) throws Exception {
    
        RegisterCarView registerCarView = new RegisterCarView();
        Car car = registerCarView.show();
        cars.add(car);
        System.out.println("Car added successfully");


    }

    

}
