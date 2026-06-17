
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String line = scanner.nextLine();

            if (line.equals("")) {
                break;
            }

            String[] words = line.split(" ");

            for (String wordPart : words) {
                if (wordPart.contains("av")) {
                    System.out.println(wordPart);
                }
            }
        }
    }
}
