package String.Level3;

import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMIStatus(double weight, double heightCm) {

        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {
                String.format("%.2f", bmi),
                status
        };
    }

    public static String[][] processBMI(double[][] people) {

        String[][] result = new String[people.length][4];

        for (int i = 0; i < people.length; i++) {

            double weight = people[i][0];
            double height = people[i][1];

            String[] bmiStatus = calculateBMIStatus(weight, height);

            result[i][0] = String.format("%.2f", height);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = bmiStatus[0];
            result[i][3] = bmiStatus[1];
        }

        return result;
    }

    public static void display(String[][] result) {

        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-12s %-12s %-12s %-15s%n",
                "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {

            System.out.printf("%-12s %-12s %-12s %-15s%n",
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);
        }

        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] people = new double[10][2];

        System.out.println("Enter weight and height for 10 people:");

        for (int i = 0; i < 10; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight (kg): ");
            people[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            people[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(people);

        display(result);

        sc.close();
    }
}
