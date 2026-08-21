package Core_Java.Class_And_Object;

/**
 * This class demonstrates an object's data (fields) and behaviour (method).
 */
public class Car {
    private final String brand;
    private final int speed;

    public Car(String brand, int speed) {
        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("brand must not be blank");
        }
        if (speed < 0) {
            throw new IllegalArgumentException("speed must not be negative");
        }
        this.brand = brand;
        this.speed = speed;
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}
