package Week06;

import java.io.*;

public class ReadingAlt {
    public static void main(String[] args) throws IOException {

        //Create a FileReader and BufferedReader with one line of code.
        BufferedReader bufReader = new BufferedReader(new FileReader("hello.txt"));

        // Read in the first line...
        String line = bufReader.readLine();

        // If this line is not null, then print it out...
        while (line != null) {
            System.out.println(line);

            // And then read in the next line
            line = bufReader.readLine();
        }
        bufReader.close(); //This closes the inner FileReader too
    }
}
