import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patt {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String a = scn.nextLine();
         Pattern symbolPattern = Pattern.compile("[!@#$%^&*()_+{}\\[\\]:;<>,.?~\\\\/-]");
         Matcher match = symbolPattern.matcher(a);

         if(!match.find()){
            System.out.println("Valid string");
         }else{
            System.out.println("Invalid Name");
         }
    }
}
