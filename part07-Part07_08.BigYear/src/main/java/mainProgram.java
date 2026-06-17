import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();
        BirdService service = new BirdService(database);

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine().trim();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String latin = scanner.nextLine();
                    service.addBird(name, latin);
                    break;

                case "observation":
                    System.out.print("Bird? ");
                    service.recordObservation(scanner.nextLine());
                    break;

                case "all":
                    service.printAllBirds();
                    break;

                case "one":
                    System.out.print("Bird? ");
                    service.printOneBird(scanner.nextLine());
                    break;

                case "quit":
                    scanner.close();
                    return;

                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
