package Core_Java.Extra;
// inheritance with super and this method


public class Super_and_this_method extends Parent {
    
    private final int value = 20;

    public void display() {
        System.out.println("Child value: " + this.value);
        System.out.println("Parent value: " + super.value);
        super.display();
    }

    public static void main(String[] args) {
        new Super_and_this_method().display();
    }


    

}

class Parent {
    protected final int value = 10;

    void display() {
        System.out.println("Parent display method called");
    }
}
