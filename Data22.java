import java.sql.*;

public class Data22 {
    public static void main(String[] args){

        String url = "jdbc:mysql://localhost:3306/javaDB";
        String usr = "root";
        String pass = "";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url,usr,pass);
            String q1 = "Select Name from employee";

            PreparedStatement pt = con.prepareStatement(q1);
            ResultSet rs = pt.executeQuery();

            while(rs.next()){
                String Name = rs.getString("Name");
                System.out.println("Hello "+ Name);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
