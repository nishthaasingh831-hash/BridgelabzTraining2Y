package String.Level2;

import java.util.Scanner;

public class SplitText {

    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    static String[] splitWords(String text) {

        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;

        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        words[wordCount - 1] = text.substring(start);

        return words;
    }

    static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String[] userWords = splitWords(text);

        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(userWords, builtInWords);

        System.out.println("\nWords using user-defined method:");
        for (String word : userWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}