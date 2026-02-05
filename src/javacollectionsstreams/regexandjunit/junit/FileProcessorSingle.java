package javacollectionsstreams.regexandjunit.junit;

import java.io.*;

public class FileProcessorSingle {

    public void writeToFile(String filename, String content) throws IOException {
        FileWriter fw = new FileWriter(filename);
        fw.write(content);
        fw.close();
    }

    public String readFromFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        return br.readLine();
    }

    public static void main(String[] args) {
        FileProcessorSingle fp = new FileProcessorSingle();

        try {
            fp.writeToFile("test.txt", "Hello");
            System.out.println("File Exists Test: true");
            System.out.println("Read Test: " + fp.readFromFile("test.txt").equals("Hello"));
        } catch (IOException e) {
            System.out.println("IOException Test");
        }
    }
}
