package Core_Java.Class_And_Object;

/**
 * A class is a blueprint. Student is a blueprint for student objects.
 */
public class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Roll number: " + rollNumber);
    }
}
