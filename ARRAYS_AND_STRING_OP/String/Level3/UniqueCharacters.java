package String.Level3;

import java.util.*;

class UniqueCharacters {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static char[] findUnique(String str) {
        int n = findLength(str);
        char[] temp = new char[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[count] = str.charAt(i);
                count++;
            }
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] result = findUnique(str);

        System.out.print("Unique characters: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}