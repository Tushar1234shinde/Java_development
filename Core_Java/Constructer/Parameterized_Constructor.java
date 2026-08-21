package Core_Java.Constructer;

public class Parameterized_Constructor {
   
    private final String name;
    private final int age;

    // Parameterized constructor
    public Parameterized_Constructor(String name, int age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }
        if (age < 0) {
            throw new IllegalArgumentException("age must not be negative");
        }
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Parameterized_Constructor person = new Parameterized_Constructor("Alice", 25);
        System.out.println(person);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
