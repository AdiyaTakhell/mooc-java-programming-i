import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;

        while (true) {

            String line = scanner.nextLine();

            if (line.isBlank()) {
                break;
            }

            String[] parts = line.split(",");
            int age = Integer.valueOf(parts[1]);

            if (age > oldestAge) {
                oldestAge = age;
            }
        }

        System.out.println("Age of the oldest: " + oldestAge);
    }
}