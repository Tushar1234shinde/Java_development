package Core_Java.Array;

public class Obj_As_Array {
    
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = {
                new Student("John", 20),
                new Student("Alice", 22),
                new Student("Bob", 19)
        };

        // Displaying the details of each student using enhanced for loop
        System.out.println("Student Details:");
        for (Student student : students) {
            System.out.println(student);
        }
        

    }
    
}
class Student {
    private final String name;
    private final int age;

    Student(String name, int age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }
        if (age < 0) {
            throw new IllegalArgumentException("age must not be negative");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
