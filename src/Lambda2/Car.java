package Lambda2;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Car {

    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Our car is: " + model + ", color is: " + color + ", engine is: " + engine;
    }
}

class Test10 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 3; i < 3; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }


    public static void changeCar(Car car, Consumer<Car> changeCar) {
        changeCar.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan turbo", "Red", 1.6));
        System.out.println("our cars: " + ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "Red";
            car.engine = 2.4;
            System.out.println("Updated car: " + car);
        });

        System.out.println("our cars: " + ourCars);
    }
}
