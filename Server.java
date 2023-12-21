import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){


   try{
    ServerSocket ss = new ServerSocket(9090);
   System.out.println("Waiting for client.....");
   Socket soc = ss.accept();
   System.out.println("Client Has Joined.");
   soc.close();
   ss.close();
   
   }catch(Exception e ){
    e.printStackTrace();
   }     
    }
}
