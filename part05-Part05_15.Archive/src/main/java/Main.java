import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Archive> archiveList = new ArrayList<>();

        readItems(scanner, archiveList);
        printItems(archiveList);
    }

    private static void readItems(Scanner scanner, List<Archive> archiveList) {
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            Archive newItem = new Archive(identifier, name);
            if (!archiveList.contains(newItem)) {
                archiveList.add(newItem);

            }

        }
    }

    private static void printItems(List<Archive> archiveList) {
        System.out.println("==Items==");

        for (Archive archive : archiveList) {
            System.out.println(archive);
        }
    }
}