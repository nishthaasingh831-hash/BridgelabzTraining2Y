package String.Level3;

import java.util.*;

class CharacterFrequency2 {

    public static String[] findFrequency(String str) {

        char[] chars = str.toCharArray();
        int[] frequency = new int[str.length()];

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != '0') {
                frequency[i] = 1;

                for (int j = i + 1; j < chars.length; j++) {

                    if (chars[i] == chars[j]) {
                        frequency[i]++;
                        chars[j] = '0';
                    }
                }
            }
        }

        String[] result = new String[str.length()];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != '0') {
                result[index] = chars[i] + " = " + frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] result = findFrequency(str);

        System.out.println("Character Frequency:");

        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                System.out.println(result[i]);
            }
        }
    }
}