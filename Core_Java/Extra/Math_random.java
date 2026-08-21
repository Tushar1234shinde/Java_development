package Core_Java.Extra;

import java.util.concurrent.ThreadLocalRandom;

public class Math_random {
    public static void main(String[] args) {
        // Generate a random number between 0.0 (inclusive) and 1.0 (exclusive)
        ThreadLocalRandom random = ThreadLocalRandom.current();
        double randomValue = random.nextDouble();
        System.out.println("Random value between 0.0 and 1.0: " + randomValue);

        // Generate a random integer between 0 (inclusive) and 10 (exclusive)
        int randomInt = random.nextInt(10);
        System.out.println("Random integer between 0 and 9: " + randomInt);

        // Generate a random integer between 1 (inclusive) and 100 (inclusive)
        int randomIntRange = random.nextInt(1, 101);
        System.out.println("Random integer between 1 and 100: " + randomIntRange);
    }
    
}
