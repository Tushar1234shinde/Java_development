package Core_Java.Class_And_Object;

/**
 * This class demonstrates an object's data (fields) and behaviour (method).
 */
public class Car {
    String brand;
    int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}
