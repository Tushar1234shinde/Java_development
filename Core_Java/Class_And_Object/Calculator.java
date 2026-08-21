package Core_Java.Class_And_Object;

public class Calculator {

    public void printSimpleAddition() {
        System.out.println("Addition of two numbers is: " + add(1, 2));
    }
    
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public void printSubtraction(int result) {
        System.out.println("Subtraction of two numbers is: " + result);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printSimpleAddition();
        int result = calculator.add(1, 2);
        System.out.println("Addition of two numbers is: " + result);
        int subResult = calculator.subtract(5, 3);
        calculator.printSubtraction(subResult);
    }
}

