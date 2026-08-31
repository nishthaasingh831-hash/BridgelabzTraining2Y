package String.Level3;

import java.util.*;

class CharacterFrequency {

    public static char[][] findFrequency(String str) {

        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        char[][] result = new char[count][2];

        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            boolean alreadyStored = false;

            for (int j = 0; j < index; j++) {
                if (result[j][0] == ch) {
                    alreadyStored = true;
                    break;
                }
            }

            if (!alreadyStored) {
                result[index][0] = ch;
                result[index][1] = (char) frequency[ch];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[][] result = findFrequency(str);

        System.out.println("Character Frequency:");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " = " + (int) result[i][1]);
        }
    }
}