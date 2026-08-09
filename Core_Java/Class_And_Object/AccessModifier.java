package Core_Java.Class_And_Object;
//public private protected default are access modifiers
// Access modifiers are also know as access specifiers. They are used to set the accessibility (visibility) of classes, constructors, methods, and other members. There are four types of access modifiers in Java:
// 1. Public: The public access modifier allows the class, method, or variable to be accessed from any other class in any package. It provides the highest level of accessibility.
// 2. Private: The private access modifier restricts the access of the class, method, or variable to within the same class only. It cannot be accessed from outside the class, including subclasses or other classes in the same package.
// 3. Protected: The protected access modifier allows the class, method, or variable to be accessed within the same package and by subclasses (even if they are in different packages). It provides a level of accessibility between public and private.
// 4. Default (no modifier): If no access modifier is specified, it is considered as default access. The class, method, or variable can be accessed only within the same package. It is not accessible from classes in different packages.  



public class AccessModifier {

    // public - accessible from anywhere
    public int publicValue = 10;

    // protected - accessible in same package and subclasses
    protected int protectedValue = 20;

    // default - accessible only within the same package
    int defaultValue = 30;

    // private - accessible only inside this class
    private int privateValue = 40;

    public void display() {
        System.out.println("Public: " + publicValue);
        System.out.println("Protected: " + protectedValue);
        System.out.println("Default: " + defaultValue);
        System.out.println("Private: " + privateValue);
    }

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        // Accessing all variables from the same class
        System.out.println("Public: " + obj.publicValue);
        System.out.println("Protected: " + obj.protectedValue);
        System.out.println("Default: " + obj.defaultValue);
        System.out.println("Private: " + obj.privateValue);

        System.out.println("\nUsing display() method:");
        obj.display();
    }
}

// Note : Because main() is inside the same AccessModifier class, all four variables can be accessed.
