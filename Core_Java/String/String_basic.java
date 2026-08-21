package Core_Java.String;

public class String_basic {
    // This class demonstrates basic operations with strings in Java.
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Displaying the original string
        System.out.println("Original String: " + str);
        
        // Getting the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Accessing characters using charAt()
        System.out.println("Characters in the string:");
        for (int i = 0; i < length; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();


        //String are immutable in java, so we cannot change the value of a string once it is created.
        //str = "New String"; // This will cause a compilation error

        //If you want to make it mutable, you can use StringBuffer or StringBuilder classes.


    }
}
