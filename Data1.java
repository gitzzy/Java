

import java.sql.Connection;
import java.sql.DriverManager;

public class Data1 {
    public static void main(String[] args) {

        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javaDB";
            String usr = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, usr, pass);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
