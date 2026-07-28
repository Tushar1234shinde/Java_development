package Core_Java.Foundation_program;

public class loops {

    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            System.out.println("For Loop: "+i);
        }

        int j=1;
        while(j<=5){
            System.out.println("While Loop: "+j);
            j++;
        }

        int k=1;
        do{
            System.out.println("Do-While Loop: "+k);
            k++;
        }while(k<=5);
    }
    
}
