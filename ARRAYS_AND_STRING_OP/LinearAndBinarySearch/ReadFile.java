package LinearAndBinarySearch;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}