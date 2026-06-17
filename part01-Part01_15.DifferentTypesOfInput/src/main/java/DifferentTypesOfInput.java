
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        
        String s = scan.nextLine();
        
        System.out.println("Give an integer:");
        
        int num = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        
        double num1 = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        
        boolean value = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + s);
            System.out.println("You gave the integer " + num);
          System.out.println("You gave the double " + num1);
          System.out.println("You gave the boolean " + value) ;
          
    }
}
