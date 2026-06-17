
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file");
        String file = scanner.nextLine();

        try ( Scanner check = new Scanner(Paths.get(file))) {
            while (check.hasNextLine()) {
                String row = check.nextLine();
                String[] parts = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }

        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
    }

}
