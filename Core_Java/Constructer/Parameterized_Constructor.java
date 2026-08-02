package Core_Java.Constructer;

public class Parameterized_Constructor {
   
    String name;
    int age;

    // Parameterized constructor
    public Parameterized_Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Parameterized_Constructor person = new Parameterized_Constructor("Alice", 25);
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
