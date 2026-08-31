package String.Level3;

import java.util.*;

class Palindrome {

    public static boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static boolean checkPalindromeRecursive(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return checkPalindromeRecursive(str, start + 1, end - 1);
    }

    public static boolean checkPalindromeArray(String str) {

        char[] original = str.toCharArray();
        char[] reverse = new char[original.length];

        for (int i = 0; i < str.length(); i++) {
            reverse[i] = str.charAt(str.length() - 1 - i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String str = sc.nextLine();

        System.out.println("\nLogic 1: " + checkPalindrome(str));

        System.out.println("Logic 2: " +
                checkPalindromeRecursive(str, 0, str.length() - 1));

        System.out.println("Logic 3: " +
                checkPalindromeArray(str));
    }
}