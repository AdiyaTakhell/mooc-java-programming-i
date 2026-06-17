import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        ArrayList<Match> matches = readMatches(fileName);

        int games = 0;
        int wins = 0;
        int losses = 0;

        for (Match match : matches) {
            if (match.getHomeTeam().equals(teamName) || match.getVisitingTeam().equals(teamName)) {
                games++;

                if (match.getHomeTeam().equals(teamName)) {
                    if (match.getHomePoints() > match.getVisitingPoints()) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (match.getVisitingTeam().equals(teamName)) {
                    if (match.getVisitingPoints() > match.getHomePoints()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

        scan.close();
    }

    public static ArrayList<Match> readMatches(String fileName) {
        ArrayList<Match> matches = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] parts = row.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                matches.add(new Match(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }

        return matches;
    }
}
