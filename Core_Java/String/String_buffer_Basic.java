package Core_Java.String;

public class String_buffer_Basic {
    
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("Hello, World!");
        
        // Displaying the original StringBuffer
        System.out.println("Original StringBuffer: " + strBuffer);
        
        // Getting the length of the StringBuffer
        int length = strBuffer.length();
        System.out.println("Length of the StringBuffer: " + length);
        
        // Accessing characters using charAt()
        System.out.println("Characters in the StringBuffer:");
        for (int i = 0; i < length; i++) {
            System.out.print(strBuffer.charAt(i) + " ");
        }
        
        // Modifying the StringBuffer
        strBuffer.append(" Welcome to Java!");
        System.out.println("\nModified StringBuffer: " + strBuffer);

        //Insert and delete operations
        strBuffer.insert(5, " Beautiful");  
        System.out.println("After insertion: " + strBuffer);
        strBuffer.delete(5, 16); // Deletes " Beautiful"
        System.out.println("\nAfter deletion: " + strBuffer);

        //StringBuffer is mutable in java, so we can change the value of a StringBuffer after it is created.
        //String Buffer is thread-safe, so it is synchronized and can be used in multi-threaded environments.
    }
}
