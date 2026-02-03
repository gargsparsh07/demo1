package javacollectionsstreams.javaiostreams;

import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) throws IOException {

        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream("student.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("Rahul");
            dos.writeDouble(8.9);
        }

        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream("student.dat"))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
        }
    }
}
