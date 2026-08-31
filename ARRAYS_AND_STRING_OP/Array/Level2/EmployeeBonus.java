package Array.Level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < salary.length; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[i] = sc.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
            }
        }

        for (int i = 0; i < salary.length; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            }

            else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n----- Employee Bonus Summary -----");

        System.out.printf("Total Old Salary = %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout = %.2f%n", totalBonus);
        System.out.printf("Total New Salary = %.2f%n", totalNewSalary);

        sc.close();
    }
}
