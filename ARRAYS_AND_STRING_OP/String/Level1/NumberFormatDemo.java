package String.Level1;

import java.util.Scanner;

public class NumberFormatDemo {

    static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }

    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled!");

        } catch (RuntimeException e) {
            System.out.println("Runtime Exception handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        generateException(text);

        handleException(text);

        sc.close();
    }
}