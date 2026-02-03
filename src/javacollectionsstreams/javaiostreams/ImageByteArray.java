package javacollectionsstreams.javaiostreams;

import java.io.*;

public class ImageByteArray {
    public static void main(String[] args) {

        File inputImage = new File("input.jpg");
        File outputImage = new File("output.jpg");

        if (!inputImage.exists()) {
            System.out.println("Image not found at: " + inputImage.getAbsolutePath());
            return;
        }

        try (
                FileInputStream fis = new FileInputStream(inputImage);
                ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ) {
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            try (FileOutputStream fos = new FileOutputStream(outputImage)) {
                fos.write(imageBytes);
            }

            System.out.println("Image copied successfully → output.jpg");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
