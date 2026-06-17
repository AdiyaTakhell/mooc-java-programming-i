
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();

        String longestName = "";

        while (true) {
            String line = scanner.nextLine();

            if (line.isBlank()) {
                break;
            }

            String[] parts = line.split(",");
            String name = parts[0];
            int year = Integer.parseInt(parts[1]);

            names.add(name);
            years.add(year);

            // Track longest name
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        // Calculate average
        int sum = 0;
        for (int year : years) {
            sum += year;
        }

        double average = 1.0 * sum / years.size();

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
