
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            if (value != 0) {
                if (value > 0) {
                    total = total + 1;
                    sum = sum + value;
                }
            } else {
                break;
            }
        }
        if (total != 0) {
            System.out.println("Average of the numbers: " + ((double) sum / total));
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
