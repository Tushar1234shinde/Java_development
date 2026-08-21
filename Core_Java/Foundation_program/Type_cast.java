package Core_Java.Foundation_program;

public class Type_cast {
    public static void main(String[] args) {
        
    
    int number = 257;
    byte narrowedNumber = (byte) number;

    float decimalNumber = 5.6f;
    int truncatedNumber = (int) decimalNumber;

    byte firstByte = 10;
    byte secondByte = 30;
    int product = firstByte * secondByte;


    System.out.println("Value of number: " + number);
    System.out.println("Narrowed byte value: " + narrowedNumber);
    System.out.println("Value of decimalNumber: " + decimalNumber);
    System.out.println("Truncated integer value: " + truncatedNumber);
    System.out.println("Product of bytes: " + product);
}
}
