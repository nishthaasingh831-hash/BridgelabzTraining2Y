package String.Level2;

import java.util.Scanner;

public class StudentVoting {

    static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            }
            else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            }
            else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    static void displayResult(String[][] result) {

        System.out.println("\nAge\tVoting Status");
        System.out.println("-------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        String[][] result = checkVoting(ages);

        displayResult(result);

        sc.close();
    }
}