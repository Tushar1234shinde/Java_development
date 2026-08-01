package Core_Java.Class_And_Object;

/**
 * Class_As_Datatype
 */
public class Class_As_Datatype {

    public static void main(String[] args) {
        // Creating an object of the class
        Class_As_Datatype obj = new Class_As_Datatype();
        System.out.println("Object created: " + obj);

        // Creating an object of the Students class
        Students student1 = new Students();
        student1.name = "John";
        student1.age = 20;
        student1.grade = "A";

        
    }
}
 class Students{
    // Class variables (attributes)
    String name;
    int age;
    String grade;

   
}