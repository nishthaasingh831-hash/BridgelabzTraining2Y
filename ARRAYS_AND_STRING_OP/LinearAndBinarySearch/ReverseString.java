package LinearAndBinarySearch;

public class ReverseString {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();

        sb.append(str);

        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello";

        String output = reverseString(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
