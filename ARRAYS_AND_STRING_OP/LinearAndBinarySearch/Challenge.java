package LinearAndBinarySearch;

import java.io.*;

public class Challenge {
    public static void main(String[] args) throws IOException {

        int n = 1000000;

        long start = System.nanoTime();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("hello");
        }

        long builderTime = System.nanoTime() - start;

        start = System.nanoTime();

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }

        long bufferTime = System.nanoTime() - start;

        System.out.println("StringBuilder Time: " + builderTime + " ns");
        System.out.println("StringBuffer Time: " + bufferTime + " ns");

        start = System.nanoTime();

        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        int words1 = 0;
        String line;

        while ((line = br.readLine()) != null) {
            if (!line.trim().isEmpty())
                words1 += line.trim().split("\\s+").length;
        }

        br.close();

        long fileTime = System.nanoTime() - start;


        start = System.nanoTime();

        FileInputStream fis = new FileInputStream("data.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br2 = new BufferedReader(isr);

        int words2 = 0;

        while ((line = br2.readLine()) != null) {
            if (!line.trim().isEmpty())
                words2 += line.trim().split("\\s+").length;
        }

        br2.close();

        long inputTime = System.nanoTime() - start;

        System.out.println("\nFileReader Word Count: " + words1);
        System.out.println("FileReader Time: " + fileTime + " ns");

        System.out.println("\nInputStreamReader Word Count: " + words2);
        System.out.println("InputStreamReader Time: " + inputTime + " ns");
    }
}