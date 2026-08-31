package LinearAndBinarySearch;

public class StringBufferExample {
    public static void main(String[] args) {

        String[] arr = {"Hello", " ", "World", "!"};

        StringBuffer sb = new StringBuffer();

        for (String str : arr) {
            sb.append(str);
        }

        System.out.println("Concatenated String: " + sb);
    }
}