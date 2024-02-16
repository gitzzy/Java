

import java.sql.Connection;
import java.sql.DriverManager;

public class Data1 {

    public static Connection con;
    public Data1(){

        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ProDB";
            String usr = "root";
            String pass = "root1234";

            con = DriverManager.getConnection(url, usr, pass);
            System.out.println("Connection Established");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
