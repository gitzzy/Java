import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOP {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write("Hello, World!".getBytes("UTF-8"));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            System.out.println(new String(byteArray, "UTF-8"));
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

