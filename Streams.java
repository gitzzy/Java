import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Streams {
    public static String fileContent;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Data : ");

        String inputData = scanner.nextLine();
        inputData += "\n";
        byte[] inputBytes = inputData.getBytes();

        try (FileInputStream in1 = new FileInputStream("/Users/devanshtyagi/Documents/work/Java#/sample.txt");
             BufferedInputStream ip1 = new BufferedInputStream(in1)) {
            byte[] fileBytes = new byte[in1.available()];
            int bytesRead = ip1.read(fileBytes);
            fileContent = new String(fileBytes, 0, bytesRead);

            System.out.println("File Content : " + fileContent);
        }

        try (FileOutputStream out = new FileOutputStream("/Users/devanshtyagi/Documents/work/Java#/sample.txt", true);
             BufferedOutputStream op = new BufferedOutputStream(out)) {
            op.write(inputBytes);
            op.flush();
            System.out.println("Data is Successfully Appended.");
        }
        scanner.close();
    }
}
