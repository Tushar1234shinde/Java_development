package Core_Java.Class_And_Object;

/**
 * Create objects from the Student and Car classes.
 */
public class ClassAndObjectDemo {
    public static void main(String[] args) {
        Student firstStudent = new Student("Aarav", 101);
        Student secondStudent = new Student("Diya", 102);
        Car car = new Car("Toyota", 60);

        firstStudent.displayDetails();
        secondStudent.displayDetails();
        car.drive();
    }
}
