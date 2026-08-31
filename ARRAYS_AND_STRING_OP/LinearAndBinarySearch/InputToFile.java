package LinearAndBinarySearch;

import java.io.*;

public class InputToFile {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        FileWriter fw = new FileWriter("data.txt");

        String line;

        System.out.println("Enter text (type exit to stop):");

        while (true) {
            line = br.readLine();

            if (line.equalsIgnoreCase("exit"))
                break;

            fw.write(line + "\n");
        }

        fw.close();

        System.out.println("Data written to file successfully.");
    }
}