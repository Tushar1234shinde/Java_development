package Core_Java.Array;

public class Enhanced_Loop_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using enhanced for loop to iterate through the array
        System.out.println("Using enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
        //also known as for-each loop, is a simplified version of the traditional for loop that allows you to iterate through elements of an array or collection without needing to manage an index variable. It improves code readability and reduces the risk of errors related to index management.

        
        // Using traditional for loop to iterate through the array
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
