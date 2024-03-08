import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Datees {
    static String fDate;
    public static void main(String[] args) {

        String dt = "12-01-2001";
       
        System.out.println(LocalDate.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fDate = LocalDate.now().format(formatter);
        System.out.println(fDate);
        Checking(dt);
    }

    public static boolean Checking(String dt){

        int len = dt.length();
        if(dt.charAt(2) == '-' && dt.charAt(len-5) == '-'){
            // System.out.println(dt.charAt(2));
            // System.out.println(dt.charAt(len-5));
            // System.out.println("valid date");
            StringBuilder dob = new StringBuilder();
            StringBuilder tdat =  new StringBuilder();
            for(int i=4; i>0; i--){
    dob.append(dt.charAt(len-i));
    tdat.append(fDate.charAt(fDate.length()-i));
            }
            System.out.println("dob : "+dob.toString());
            System.out.println("today : "+tdat.toString());
    int age = Integer.parseInt(tdat.toString())-Integer.parseInt(dob.toString());
            if(age >= 18){
    System.out.println("You are Eligible : "+age);
    return true;
            }else{
                System.out.println("Not Eligible : "+age);
                return false;
            }
        }else{
            // System.out.println("invalid");
            // System.out.println(dt.charAt(2));
            // System.out.println(dt.charAt(len-5));
            return false;
        }
    
    }
}
