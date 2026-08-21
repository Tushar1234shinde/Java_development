package Core_Java.Inheritance;

public class SingleInheritance {
    
    public static void main(String[] args) {
        // Creating an object of the subclass
        Dog dog = new Dog();
        dog.eat(); // Calling method from the superclass
        dog.bark(); // Calling method from the subclass
    }

    private static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    private static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

}
