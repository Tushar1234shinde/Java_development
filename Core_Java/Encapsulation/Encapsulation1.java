package Core_Java.Encapsulation;

public class Encapsulation1 {
    private String name;
    private int age;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age must not be negative");
        }
        this.age = age;
    }

    public static void main(String[] args) {
        
        Encapsulation1 person = new Encapsulation1();
        person.setName("John Doe");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

}
