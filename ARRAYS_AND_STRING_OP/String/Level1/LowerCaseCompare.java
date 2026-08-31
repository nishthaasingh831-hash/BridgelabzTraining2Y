package String.Level1;

import java.util.Scanner;

public class LowerCaseCompare {

    static String convertToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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

        String lowerText1 = convertToLowerCase(text);

        String lowerText2 = text.toLowerCase();

        boolean result = compareStrings(lowerText1, lowerText2);

        System.out.println("User-defined lowercase: " + lowerText1);
        System.out.println("Built-in lowercase: " + lowerText2);
        System.out.println("Are both strings same? " + result);

        sc.close();
    }
}