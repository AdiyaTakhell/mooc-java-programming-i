
import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.valueOf(scan.nextLine());
        printFromNumberToOne(num);

    }

    public static void printFromNumberToOne(int number) {
        while (number > 0) {
            System.out.println(number);
            number--;
        }
    }
}
