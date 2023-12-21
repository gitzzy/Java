import java.sql.*;
import java.util.Scanner;

public class Data3 {
    public static void main(String[] args){

        String url = "jdbc:mysql://localhost:3308/JavaDB";
        String usr = "root";
        String pass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,usr,pass);

            System.out.println("Connection Successfully Established");

            Scanner scn = new Scanner(System.in);

            System.out.print("Enter your Name : ");
            String Name = scn.nextLine();

            System.out.print("Enter your Surname : ");
            String sName = scn.nextLine();

            System.out.print("Enter Your City : ");
            String City = scn.nextLine();

            String q1 = "insert into data3 values (?,?,?)";
            PreparedStatement pt = con.prepareStatement(q1);
             pt.setString(1,Name);
             pt.setString(2,sName);
             pt.setString(3,City);
             pt.executeUpdate();
             con.close();

             if(con.isClosed()){
                 System.out.print("Connection is successfully Terminated...");
             }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
