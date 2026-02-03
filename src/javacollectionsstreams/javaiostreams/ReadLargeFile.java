package javacollectionsstreams.javaiostreams;

import java.io.*;

public class ReadLargeFile {
    public static void main(String[] args) {

        File file = new File("large.log");

        if (!file.exists()) {
            System.out.println("File not found at: " + file.getAbsolutePath());
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
