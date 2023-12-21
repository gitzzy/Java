import java.net.Socket;
import java.util.Scanner;
import java.io.*;

public class You {
    public static void main(String[] args) {
        try {
            // 2
            Socket soc = new Socket("localhost", 1234);

            InputStream i1 = soc.getInputStream(); // Reading
            InputStreamReader Read1 = new InputStreamReader(i1);
            BufferedReader br1 = new BufferedReader(Read1);

            OutputStream o1 = soc.getOutputStream(); // Write
            OutputStreamWriter Write1 = new OutputStreamWriter(o1);
            BufferedWriter br2 = new BufferedWriter(Write1);

            Scanner scn = new Scanner(System.in);


            while(true){
                System.out.print("You : ");
                String name = scn.nextLine();
                br2.write(name+"\n");
                br2.flush();

                String SerMsg = br1.readLine();
                System.out.println("User says ----> " + SerMsg);

                if(SerMsg.equals("bye")){
                    break;
                }
            }
            soc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
