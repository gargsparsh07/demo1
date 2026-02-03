package javacollectionsstreams.javaiostreams;

import java.io.*;

public class BufferedVsUnbufferedCopy {

    public static void main(String[] args) throws IOException {

        File source = new File("resources/largefile.dat");

        if (!source.exists()) {
            System.out.println("Source file not found: " + source.getAbsolutePath());
            return;
        }

        copyUnbuffered(source, new File("resources/unbuffered_copy.dat"));
        copyBuffered(source, new File("resources/buffered_copy.dat"));
    }

    static void copyUnbuffered(File src, File dest) throws IOException {
        long start = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        }

        long end = System.nanoTime();
        System.out.println("Unbuffered time: " + (end - start) / 1_000_000 + " ms");
    }

    static void copyBuffered(File src, File dest) throws IOException {
        long start = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }

        long end = System.nanoTime();
        System.out.println("Buffered time: " + (end - start) / 1_000_000 + " ms");
    }
}
