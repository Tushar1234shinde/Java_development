package Core_Java.Extra;
// inheritance with super and this method
// Every class in Java is a subclass of Object class. 
// The Object class is the root of the class hierarchy. 
// Every class has Object as a superclass. All objects, including arrays, implement the methods 
// of this class.







// 1. Access the parent class's fields

// If both the parent and child classes have a variable with the same name, super refers to the parent's variable.

// class Animal {
//     String name = "Animal";
// }

// class Dog extends Animal {
//     String name = "Dog";

//     void display() {
//         System.out.println(name);        // Dog
//         System.out.println(super.name);  // Animal
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.display();
//     }
// }

// Output:

// Dog
// Animal
// 2. Call the parent class's method

// If a child class overrides a method, super can be used to call the original implementation.

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }

//     void showSounds() {
//         sound();        // Calls Dog's method
//         super.sound();  // Calls Animal's method
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.showSounds();
//     }
// }

// Output:

// Dog barks
// Animal makes a sound
// 3. Call the parent class's constructor

// super() is used to invoke the constructor of the parent class.

// class Animal {
//     Animal() {
//         System.out.println("Animal constructor");
//     }
// }

// class Dog extends Animal {
//     Dog() {
//         super(); // Calls Animal constructor
//         System.out.println("Dog constructor");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//     }
// }

// Output:

// Animal constructor
// Dog constructor

// Note: If you don't explicitly write super(), Java automatically inserts it as the first statement in the child constructor (provided the parent has a no-argument constructor).

// Rules about super
// super() must be the first statement in a constructor.
// You cannot use super in a static method because it refers to an instance of the parent class.
// super only refers to the immediate parent class.
// this vs super
// this	super
// Refers to the current object	Refers to the parent class object
// Accesses current class fields and methods	Accesses parent class fields and methods
// Calls another constructor in the same class (this())	Calls a parent constructor (super())
// Example
// class Person {
//     String name = "Parent";
// }

// class Student extends Person {
//     String name = "Child";

//     void printNames() {
//         System.out.println(this.name);   // Child
//         System.out.println(super.name);  // Parent
//     }
// }
// Summary
// super.field → Access a parent class field.
// super.method() → Call a parent class method.
// super() → Call a parent class constructor.

// The super keyword is primarily used in inheritance to reuse or access functionality from a superclass while allowing the subclass to extend or customize behavior.