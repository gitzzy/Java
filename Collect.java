import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Collect {
    public static void main(String[] args){

        ArrayList<String> a1  = new ArrayList<>();
        LinkedList<String> a2 = new LinkedList<>();
        Stack<String> a3 = new Stack<>();
        ArrayDeque<String> a4 = new ArrayDeque<>();
        HashSet<String> a5 = new HashSet<>();

        a1.add("Delhi");
        System.out.println("Size of Array : "+a1.size());
        
        a3.push("New York");
        System.out.println("Stack : "+a3.elementAt(0));
        a4.push("Dubai");
        System.out.println("ArrayDeque : "+a4.poll());
        System.out.println(a4);
        

    }
}
