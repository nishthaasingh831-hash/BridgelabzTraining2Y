package String.Level2;

import java.util.Scanner;

public class VowelConsonantCountt {

    static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

            return "Vowel";

        }

        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        else {
            return "Not a Letter";
        }
    }


    static int[] findVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            }
            else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();


        int[] count = findVowelsAndConsonants(text);

        System.out.println("Number of Vowels: " + count[0]);
        System.out.println("Number of Consonants: " + count[1]);

        sc.close();
    }
}