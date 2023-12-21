
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Data2 {
    public static void main(String[] args){

        String url = "jdbc:mysql://localhost:3308/JavaDB";
        String usr = "root";
        String pass = "";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,usr,pass);
            Scanner scn =new Scanner(System.in);

            System.out.print("Enter Your EmpID : ");
            int Id  = scn.nextInt();
            scn.nextLine();
            System.out.print("Enter Your Name : ");
            String Name = scn.nextLine();
            System.out.print("Enter Your Mail : ");
            String Mail = scn.nextLine();
            System.out.print("Enter Your Age : ");
            int Age = scn.nextInt();
            scn.nextLine();

            String q1 = "insert into emptb(empID,empName,mail,Age) values(?,?,?,?)";

          PreparedStatement pt = con.prepareStatement(q1);
            pt.setInt(1,Id);
            pt.setString(2,Name);
            pt.setString(3,Mail);
            pt.setInt(4,Age);

            pt.executeUpdate();
            System.out.println("Data Is Added.");
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
