package String.Level2;

import java.util.Scanner;

public class RockPaperScissors {

    public static int computerChoice() {
        return (int)(Math.random() * 3) + 1;
        // 1 = Rock, 2 = Paper, 3 = Scissors
    }

    public static String choiceName(int choice) {
        if (choice == 1)
            return "Rock";
        else if (choice == 2)
            return "Paper";
        else
            return "Scissors";
    }

    public static int findWinner(int player, int computer) {

        if (player == computer)
            return 0;

        if ((player == 1 && computer == 3) ||
                (player == 2 && computer == 1) ||
                (player == 3 && computer == 2)) {
            return 1;
        }

        return 2;
    }

    public static String[][] calculateStats(int playerWins,
                                            int computerWins,
                                            int draws,
                                            int games) {

        double playerPercentage = (playerWins * 100.0) / games;
        double computerPercentage = (computerWins * 100.0) / games;

        double playerAverage = playerWins / (double) games;
        double computerAverage = computerWins / (double) games;

        String[][] stats = {
                {"Statistic", "Player", "Computer"},
                {"Wins", String.valueOf(playerWins),
                        String.valueOf(computerWins)},
                {"Average Wins/Game",
                        String.format("%.2f", playerAverage),
                        String.format("%.2f", computerAverage)},
                {"Winning Percentage",
                        String.format("%.2f%%", playerPercentage),
                        String.format("%.2f%%", computerPercentage)},
                {"Draws", String.valueOf(draws), String.valueOf(draws)}
        };

        return stats;
    }

    public static void displayResults(String[][] results,
                                      String[][] stats) {

        System.out.println("\n========== GAME RESULTS ==========");
        System.out.printf("%-8s %-15s %-15s %-15s%n",
                "Game", "Player", "Computer", "Winner");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-8s %-15s %-15s %-15s%n",
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    results[i][3]);
        }

        System.out.println("\n========== STATISTICS ==========");
        System.out.printf("%-25s %-15s %-15s%n",
                stats[0][0], stats[0][1], stats[0][2]);

        for (int i = 1; i < stats.length; i++) {
            System.out.printf("%-25s %-15s %-15s%n",
                    stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = input.nextInt();

        String[][] results = new String[games][4];

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int i = 0; i < games; i++) {

            System.out.println("\nGame " + (i + 1));
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            int playerChoice;

            do {
                System.out.print("Enter your choice (1-3): ");
                playerChoice = input.nextInt();

                if (playerChoice < 1 || playerChoice > 3)
                    System.out.println("Invalid choice. Try again.");

            } while (playerChoice < 1 || playerChoice > 3);

            int computer = computerChoice();

            int winner = findWinner(playerChoice, computer);

            String winnerName;

            if (winner == 1) {
                winnerName = "Player";
                playerWins++;
            }
            else if (winner == 2) {
                winnerName = "Computer";
                computerWins++;
            }
            else {
                winnerName = "Draw";
                draws++;
            }

            results[i][0] = String.valueOf(i + 1);
            results[i][1] = choiceName(playerChoice);
            results[i][2] = choiceName(computer);
            results[i][3] = winnerName;
        }

        String[][] stats = calculateStats(
                playerWins,
                computerWins,
                draws,
                games
        );

        displayResults(results, stats);

        input.close();
    }
}
