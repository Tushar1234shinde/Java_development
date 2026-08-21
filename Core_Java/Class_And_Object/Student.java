package Core_Java.Class_And_Object;

/**
 * A class is a blueprint. Student is a blueprint for student objects.
 */
public class Student {
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }
        if (rollNumber <= 0) {
            throw new IllegalArgumentException("rollNumber must be positive");
        }
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Roll number: " + rollNumber);
    }
}
