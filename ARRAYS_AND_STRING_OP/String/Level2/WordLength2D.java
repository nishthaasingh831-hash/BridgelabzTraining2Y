package String.Level2;

import java.util.Scanner;

public class WordLength2D {

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

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else {
                words[wordIndex] = word;
                wordIndex++;
                word = "";
            }
        }

        words[wordIndex] = word;

        return words;
    }

    static String[][] getWordAndLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];

            int length = findLength(words[i]);

            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = getWordAndLength(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {
            String word = result[i][0];

            int length = Integer.parseInt(result[i][1]);

            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}