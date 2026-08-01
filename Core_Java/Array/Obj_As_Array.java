package Core_Java.Array;

public class Obj_As_Array {
    
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student s1 = new Student();
        s1.age = 20;
        s1.name = "John";

         Student s2 = new Student();
        s2.age = 22;
        s2.name = "Alice";

         Student s3 = new Student();
        s3.age = 19;
        s3.name = "Bob";

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Displaying the details of each student using enhanced for loop
        System.out.println("Student Details:");
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
        

    }
    
}
class Student {
    String name;
    int age;

    
}
