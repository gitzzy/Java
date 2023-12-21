import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayIP {
    public static void main(String[] args) {

        byte[] byteArray = { 65, 66, 67, 68, 90 };

        try (InputStream inputStream = new ByteArrayInputStream(byteArray)) {
            int data;

            while ((data = inputStream.read()) != -1) {

                System.out.print((char) data + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
