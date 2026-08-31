package Array.Level2;

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter details for " + names[i] + ":");

            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height: ");
            heights[i] = sc.nextDouble();

            System.out.println();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < names.length; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend: " + names[youngestIndex]
                + " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest friend: " + names[tallestIndex]
                + " (Height: " + heights[tallestIndex] + ")");

        sc.close();
    }
}
