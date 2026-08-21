package Core_Java.Extra;

public class Char_At_arr {
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] characters = str.toCharArray();

        // Displaying the characters in the array
        System.out.println("Characters in the array:");
        for (char character : characters) {
            System.out.print(character + " ");
        }
        System.out.println();
    }
}
