package String.Level1;

import java.util.Scanner;

public class UpperCaseCompare {

    static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result = result + ch;
        }

        return result;
    }

    static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String convertedText = convertToUpperCase(text);

        String upperText = text.toUpperCase();
        boolean result = compareStrings(convertedText, upperText);

        System.out.println("User-defined uppercase: " + convertedText);
        System.out.println("Built-in uppercase: " + upperText);
        System.out.println("Are both strings same? " + result);

        sc.close();
    }
}