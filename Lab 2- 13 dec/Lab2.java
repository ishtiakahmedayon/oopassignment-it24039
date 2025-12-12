import java.io.*;
import java.util.*;

public class Lab2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Input.txt"));
            PrintWriter pw = new PrintWriter("Output.txt");

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                int max = Integer.MIN_VALUE;

                for (String p : parts) {
                    int n = Integer.parseInt(p.trim());
                    if (n > max) max = n;
                }

                pw.println(max);
            }

            sc.close();
            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

