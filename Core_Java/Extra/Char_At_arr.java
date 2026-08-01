package Core_Java.Extra;

public class Char_At_arr {
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = new char[str.length()];

        // Using charAt() to fill the charArray
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        // Displaying the characters in the array
        System.out.println("Characters in the array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
