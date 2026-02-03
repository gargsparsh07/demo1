package javacollectionsstreams.javaiostreams;

import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("user.txt")) {

            System.out.print("Enter Name: ");
            String name = br.readLine();

            System.out.print("Enter Age: ");
            String age = br.readLine();

            System.out.print("Favorite Language: ");
            String lang = br.readLine();

            fw.write(name + "\n" + age + "\n" + lang);
            System.out.println("Data saved successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
