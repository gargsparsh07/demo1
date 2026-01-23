package datastructure.linearandbinarysearch.filereader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordInFile {

    public static void main(String[] args) throws IOException {

        String targetWord = "java";
        int count = 0;

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(targetWord)) {
                    count++;
                }
            }
        }

        br.close();
        System.out.println("Word count: " + count);
    }
}
