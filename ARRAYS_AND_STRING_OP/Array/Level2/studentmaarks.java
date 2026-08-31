package Array.Level2;

import java.util.Scanner;

public class studentmaarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] data = new double[n][4];

        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            data[i][1] = sc.nextDouble();

            System.out.print("Enter Maths marks: ");
            data[i][2] = sc.nextDouble();

            if (data[i][0] < 0 || data[i][1] < 0 || data[i][2] < 0) {
                System.out.println("Please enter positive marks.");
                i--;
                continue;
            }

            data[i][3] = (data[i][0] + data[i][1] + data[i][2]) / 3;

            if (data[i][3] >= 80)
                grade[i] = "A";
            else if (data[i][3] >= 70)
                grade[i] = "B";
            else if (data[i][3] >= 60)
                grade[i] = "C";
            else if (data[i][3] >= 50)
                grade[i] = "D";
            else if (data[i][3] >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        System.out.println("\n--- Student Results ---");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + data[i][0]);
            System.out.println("Chemistry: " + data[i][1]);
            System.out.println("Maths: " + data[i][2]);
            System.out.println("Percentage: " + data[i][3] + "%");
            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}