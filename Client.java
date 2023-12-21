
import java.net.Socket;

public class Client {
    public static void main(String[] args){

       try{

Socket soc =  new Socket("localhost",9090);
System.out.println("Connection is Successfully Established.");
soc.close();

       }catch(Exception e){
        e.printStackTrace();
       }
    }
}
