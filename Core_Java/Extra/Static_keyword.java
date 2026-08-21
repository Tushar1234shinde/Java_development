package Core_Java.Extra;

public class Static_keyword {
    
    private static int count;

    // Static method
    public static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("Initial count: " + count);
        
        // Incrementing count using static method
        incrementCount();
        incrementCount();
        
        System.out.println("Count after incrementing: " + count);
    }
    //static blocks are used to initialize static variables. 
    // It is executed before the main method at the time of class loading.

    static {
        System.out.println("Static block executed. Initializing static variables.");
        count = 10;
    }

}
