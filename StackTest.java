import java.util.Scanner;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stc = new Stack<>();
        stc.push(10);
        stc.push(20);
        stc.push(30);
        stc.push(40);
        stc.push(50);

        Scanner scn = new Scanner(System.in);
        System.out.println("Old Stack : "+stc);
        System.out.print("Enter Element to be removed : ");
        int num = scn.nextInt();
        System.out.println();
        stc.removeElement(num);
        System.out.println("New Stack : "+stc);
        System.out.println("rev : "+stc.reversed());
        scn.close();
    }
}
