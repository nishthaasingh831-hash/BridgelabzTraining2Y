package LinearAndBinarySearch;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderExample {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("data.txt");

        InputStreamReader isr =
                new InputStreamReader(fis, StandardCharsets.UTF_8);

        BufferedReader br = new BufferedReader(isr);

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}