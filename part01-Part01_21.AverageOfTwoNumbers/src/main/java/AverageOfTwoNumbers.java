
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
           System.out.println("Give the first number:");
        int num = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + ((double) (num + num1) / 2)) ;
        

    }
}
