package Core_Java.Foundation_program;
import java.util.Scanner;

public class switch_case {

    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a day number (1-7): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a whole number.");
                return;
            }
            System.out.println(dayName(scanner.nextInt()));
        }
    }

    private static String dayName(int day) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return day >= 1 && day <= days.length ? days[day - 1] : "Invalid day";
    }
}
