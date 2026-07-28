package Core_Java.Foundation_program;

public class Operator {
    public static void main(String[] args) {
        //arithmatic operator
        int a=10,b=20;
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=b/a;
        int mod=b%a;

        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        System.out.println("Sum of a and b: "+sum);
        System.out.println("Subtraction of a and b: "+sub);
        System.out.println("Multiplication of a and b: "+mul);
        System.out.println("Division of a and b: "+div);
        System.out.println("Modulus of a and b: "+mod);

        //assignment operator
        int x=10;
        x+=5; // x = x + 5
        System.out.println("Value of x: "+x);

        //comparison operator
        int p=10,q=20;
        System.out.println("Is p equal to q? "+(p==q));
        System.out.println("Is p not equal to q? "+(p!=q));

        //logical operator
        boolean r=true,s=false; 
        System.out.println("Is r true and s false? "+(r&&s));
        System.out.println("Is r true or s false? "+(r||s));
        System.out.println("Is r not true? "+(!r));

        //unary operator
        int c=10;
        System.out.println("Value of c: "+c);
        System.out.println("Value of c after increment: "+(++c));
        System.out.println("Value of c after decrement: "+(--c));


        //ternary operator
        int age=18;
        String result=(age>=18)?"Adult":"Minor";
        System.out.println("Age: "+age);
        System.out.println("Result: "+result);

        //bitwise operator
        int m=5,n=3;
        System.out.println("Bitwise AND of m and n: "+(m&n));
        System.out.println("Bitwise OR of m and n: "+(m|n));
        System.out.println("Bitwise XOR of m and n: "+(m^n));
        System.out.println("Bitwise NOT of m: "+(~m));
        System.out.println("Left shift of m by 1: "+(m<<1));
        System.out.println("Right shift of m by 1: "+(m>>1));

        //instanceof operator
        String str="Hello";
        System.out.println("Is str an instance of String? "+(str instanceof String));

       
    }
    
}
