package Core_Java.Constructer;

public class Default_Constructor {
    
    String name;
    int age;

    // Default constructor
    public Default_Constructor() {
        this.name = "Unknown";
        this.age = 0;
    }

    public static void main(String[] args) {
        Default_Constructor person = new Default_Constructor();
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
