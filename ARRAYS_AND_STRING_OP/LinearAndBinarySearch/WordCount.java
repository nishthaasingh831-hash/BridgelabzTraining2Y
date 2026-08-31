package LinearAndBinarySearch;

import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        String target = "Java";
        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");

            for (String word : words) {
                if (word.equals(target)) {
                    count++;
                }
            }
        }

        br.close();

        System.out.println("Word '" + target + "' occurs " + count + " times.");
    }
}