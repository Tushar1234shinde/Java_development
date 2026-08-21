package Core_Java.String;

public class String_buffer_Basic {
    
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");
        
        // Displaying the original StringBuffer
        System.out.println("Original StringBuffer: " + stringBuffer);
        
        // Getting the length of the StringBuffer
        int length = stringBuffer.length();
        System.out.println("Length of the StringBuffer: " + length);
        
        // Accessing characters using charAt()
        System.out.println("Characters in the StringBuffer:");
        for (int i = 0; i < length; i++) {
            System.out.print(stringBuffer.charAt(i) + " ");
        }
        
        // Modifying the StringBuffer
        stringBuffer.append(" Welcome to Java!");
        System.out.println("\nModified StringBuffer: " + stringBuffer);

        //Insert and delete operations
        stringBuffer.insert(5, " Beautiful");
        System.out.println("After insertion: " + stringBuffer);
        stringBuffer.delete(5, 16); // Deletes " Beautiful"
        System.out.println("\nAfter deletion: " + stringBuffer);

        //StringBuffer is mutable in java, so we can change the value of a StringBuffer after it is created.
        //String Buffer is thread-safe, so it is synchronized and can be used in multi-threaded environments.
    }
}
