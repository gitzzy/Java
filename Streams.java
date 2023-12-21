import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class Streams {
    public static void main(String[] args)throws IOException{

        BufferedInputStream ip = new BufferedInputStream(System.in);
        System.out.print("Enter Your Data : ");

        byte[] bytes = new byte[1024];
        ip.read(bytes);

        FileOutputStream out = new FileOutputStream("/Users/devanshtyagi/Documents/work/Java#/sample.txt"); 
        BufferedOutputStream op = new BufferedOutputStream(out);
        op.write(bytes);
        op.flush();
        System.out.println("Data is Successfully Saved.");

        FileInputStream in1 = new FileInputStream("/Users/devanshtyagi/Documents/work/Java#/sample.txt");
        BufferedInputStream ip1 = new BufferedInputStream(in1);
        byte[] bytess = new byte[1024];
        System.out.println("File Content : "+ip1.read(bytess));

    }
}
