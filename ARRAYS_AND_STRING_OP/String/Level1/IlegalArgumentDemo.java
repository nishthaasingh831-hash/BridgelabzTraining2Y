package String.Level1;

import java.util.Scanner;

public class IlegalArgumentDemo {

    static void generateException(String str) {
        System.out.println(str.substring(5, 2));
    }

    static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled!");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        generateException(str);

        handleException(str);

        sc.close();
    }
}