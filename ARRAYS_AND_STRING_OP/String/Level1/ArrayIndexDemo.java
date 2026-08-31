package String.Level1;

import java.util.Scanner;

public class ArrayIndexDemo {

    static void generateException(String[] names) {
        System.out.println(names[names.length + 1]);
    }

    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length + 1]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled!");

        } catch (RuntimeException e) {
            System.out.println("Runtime Exception handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        generateException(names);

        handleException(names);

        sc.close();
    }
}