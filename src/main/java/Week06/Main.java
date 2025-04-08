package Week06;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList data = new ArrayList();
        data.add("Hello");
        data.add("1234");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter ("output.txt"));
            for (int x = 0; x < 3; x++) {
                Object dataToWrite = data.get(x);
                writer.write(dataToWrite.toString());
            }
            writer.close();
        }
        catch (IOException ioe) {
            System.out.println("An 10 exception was thrown");
            ioe.printStackTrace();
        }
        catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Tried to access non-existent element of ArrayList ");
            ioobe.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Another type of exception was thrown");
            e.printStackTrace();
        }
    }
}
