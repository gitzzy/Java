import java.util.Scanner;

public class Simple {
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String Name = scn.nextLine();
        scn.close();
        System.out.println("Hello! "+Name);
    }
}
