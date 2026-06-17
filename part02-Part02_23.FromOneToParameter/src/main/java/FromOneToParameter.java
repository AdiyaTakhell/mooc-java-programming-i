
import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        printUntilNumber(num);

    }

    public static void printUntilNumber(int number) {
        int i = 0;

        while (i < number) {
            i++;
            System.out.println(i);
        }
    }
}
