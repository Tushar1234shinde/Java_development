package Core_Java.Inheritance;

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
class SingleInheritance {
    
    public static void main(String[] args) {
        // Creating an object of the subclass
        Dog dog = new Dog();
        dog.eat(); // Calling method from the superclass
        dog.bark(); // Calling method from the subclass
    }

}
