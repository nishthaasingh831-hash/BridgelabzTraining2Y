package String.Level2;

import java.util.Scanner;

public class ShortestLongestString {

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

    static String[][] getWordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];

            int length = findLength(words[i]);

            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    static int[] findShortestLongest(String[][] data) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {

            int currentLength = Integer.parseInt(data[i][1]);
            int shortestLength = Integer.parseInt(data[shortest][1]);
            int longestLength = Integer.parseInt(data[longest][1]);

            if (currentLength < shortestLength) {
                shortest = i;
            }

            if (currentLength > longestLength) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] wordData = getWordLength(words);

        int[] indexes = findShortestLongest(wordData);

        System.out.println("\nShortest word: " + wordData[indexes[0]][0]);
        System.out.println("Longest word: " + wordData[indexes[1]][0]);

        sc.close();
    }
}