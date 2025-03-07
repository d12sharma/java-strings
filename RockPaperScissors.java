import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of games:");
        int numGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[][] results = new String[numGames][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.println("Enter Rock, Paper, or Scissors:");
            String userChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;
        }
        
        
        String[][] stats = calculateStats(userWins, computerWins, numGames);
        displayResults(results, stats);
    }
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) return "Draw";
        if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][2];
        stats[0][0] = "User";
        stats[0][1] = String.format("%.2f%%", (userWins * 100.0 / totalGames));
        stats[1][0] = "Computer";
        stats[1][1] = String.format("%.2f%%", (computerWins * 100.0 / totalGames));
        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("Game	User Choice	Computer Choice	Winner");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
        System.out.println("\nWin Percentage:");
        System.out.println("Player\tWin %");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    
}
