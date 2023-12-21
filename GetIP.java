import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();

            System.out.println("IP Address: " + localhost.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

