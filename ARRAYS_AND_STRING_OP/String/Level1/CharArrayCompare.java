package String.Level1;

import java.util.Scanner;

public class CharArrayCompare {

    public static char[] getCharacters(String text) {

        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] array1 = getCharacters(text);

        char[] array2 = text.toCharArray();

        boolean result = compareArrays(array1, array2);

        System.out.print("\nCharacters: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n\nAre both arrays same? " + result);

        sc.close();
    }
}