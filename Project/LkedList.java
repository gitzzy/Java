import java.util.LinkedList;
import java.util.Scanner;

public class LkedList {
    public static void main(String[] args) {
        
    
        LinkedList<Integer> ld = new LinkedList<>();

        ld.add(0);
        ld.add(10);
        ld.add(20);
        ld.add(30);
        ld.add(40);
    
       int len = ld.size();
System.out.println(len);
        int find = 2;
        int l = len -find;
        int f = find;

        System.out.println(ld.get(l));


    }
}
