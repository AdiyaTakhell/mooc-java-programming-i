
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String number = scanner.nextLine();
            if (!number.equals("end")) {
                int cube = Integer.valueOf(number);
                System.out.println((int)Math.pow(cube, 3));
            } else {
                break;
            }

        }
    }
}
