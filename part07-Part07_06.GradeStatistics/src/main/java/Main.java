import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point totals, -1 stops:");

        int count = 0;
        int sum = 0;

        int passingPoints = 0;
        int passingCount = 0;

        int five = 0;
        int four = 0;
        int three = 0;
        int two = 0;
        int one = 0;
        int zero = 0;

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number < 0 || number > 100) {
                continue;
            }

            sum += number;
            count++;

            if (number >= 50) {
                passingCount++;
                passingPoints += number;
            }

            if (number < 50) {
                zero++;
            } else if (number < 60) {
                one++;
            } else if (number < 70) {
                two++;
            } else if (number < 80) {
                three++;
            } else if (number < 90) {
                four++;
            } else {
                five++;
            }
        }

        System.out.println("Point average (all): " + (double) sum / count);

        if (passingCount > 0) {
            System.out.println("Point average (passing): "
                    + (double) passingPoints / passingCount);
        } else {
            System.out.println("Point average (passing): -");
        }

        System.out.println("Pass percentage: "
                + (100.0 * passingCount / count));

        System.out.println("Grade distribution:");
        System.out.println("5: " + "*".repeat(five));
        System.out.println("4: " + "*".repeat(four));
        System.out.println("3: " + "*".repeat(three));
        System.out.println("2: " + "*".repeat(two));
        System.out.println("1: " + "*".repeat(one));
        System.out.println("0: " + "*".repeat(zero));
    }
}