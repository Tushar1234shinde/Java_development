package Core_Java.Extra;

public class Math_random {
    public static void main(String[] args) {
        // Generate a random number between 0.0 (inclusive) and 1.0 (exclusive)
        double randomValue = Math.random();
        System.out.println("Random value between 0.0 and 1.0: " + randomValue);

        // Generate a random integer between 0 (inclusive) and 10 (exclusive)
        int randomInt = (int) (Math.random() * 10);
        System.out.println("Random integer between 0 and 9: " + randomInt);

        // Generate a random integer between 1 (inclusive) and 100 (inclusive)
        int randomIntRange = (int) (Math.random() * 100) + 1;
        System.out.println("Random integer between 1 and 100: " + randomIntRange);
    }
    
}
