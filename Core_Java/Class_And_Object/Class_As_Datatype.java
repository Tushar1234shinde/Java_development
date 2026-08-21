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
        Students student = new Students("John", 20, "A");
        System.out.println(student);
    }
}
class Students {
    private final String name;
    private final int age;
    private final String grade;

    Students(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{name='%s', age=%d, grade='%s'}".formatted(name, age, grade);
    }
}
