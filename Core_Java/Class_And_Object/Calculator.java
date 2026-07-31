package Core_Java.Class_And_Object;

public class Calculator {

    public void simp_Add()
    {
        int a=1;
        int b=2;
        int c=a+b;
        System.out.println("Addition of two numbers is: "+c);
    }
    
    public int add(int a, int b)
    {
        int c=a+b;
        return c;
    }

    public int sub(int a, int b)
    {
        int c=a-b;
       return c;

    }
    public void dis_sub(int c){
        System.out.println("Subtraction of two numbers is: "+c);
        
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.simp_Add();
        int result = c.add(1, 2);
        System.out.println("Addition of two numbers is: " + result);
        int subResult = c.sub(5, 3);
        c.dis_sub(subResult);
    }
}

