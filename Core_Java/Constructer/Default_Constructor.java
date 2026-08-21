package Core_Java.Constructer;

public class Default_Constructor {
    
    private final String name;
    private final int age;

    // Default constructor
    public Default_Constructor() {
        this.name = "Unknown";
        this.age = 0;
    }

    public static void main(String[] args) {
        Default_Constructor person = new Default_Constructor();
        System.out.println(person);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
