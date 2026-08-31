package String.Level3;

import java.util.*;

class Anagram {

    public static boolean checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            frequency1[str1.charAt(i)]++;
            frequency2[str2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String str2 = sc.nextLine();

        if (checkAnagram(str1, str2)) {
            System.out.println("The two texts are Anagrams.");
        } else {
            System.out.println("The two texts are not Anagrams.");
        }
    }
}