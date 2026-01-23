package datastructure.linearandbinarysearch.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("sample.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
