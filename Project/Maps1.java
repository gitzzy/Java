import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Maps1 {
    public static void main(String[] args){

        Map<String,Integer> mathMarks = new HashMap<>();
        mathMarks.put("Devansh", 100);
        mathMarks.put("Vishal", 45);
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Name : ");
        String Name = scn.nextLine();
        System.out.println(Name+" Your Marks is "+mathMarks.get(Name));
        System.out.println(mathMarks.entrySet());
        scn.close();
    }
}
