
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();

        try ( Scanner check = new Scanner(Paths.get(fileName))) {
            while (check.hasNextLine()) {
                String row = check.nextLine();
                System.out.println(row);
            }

        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

    }
}
