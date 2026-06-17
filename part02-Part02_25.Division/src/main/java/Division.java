
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"
        Scanner scan = new Scanner(System.in);
        int numerator = Integer.valueOf(scan.nextLine());
        int denominator = Integer.valueOf(scan.nextLine());
        division(numerator, denominator);
    }

    // implement the method here
    public static void division(int numerator, int denominator) {
        System.out.println((double) numerator / denominator);
    }
}
