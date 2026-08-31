package LinearAndBinarySearch;

import java.util.HashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "programming";

        String output = removeDuplicates(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
