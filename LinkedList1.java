import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args){

        LinkedList<String> cntry = new LinkedList<>();
        cntry.add("India");
        cntry.add("Israel");
        cntry.add("Iran");
        cntry.add("Italy");

        for (String i:cntry
             ) {
            System.out.println(i);
        }
        System.out.print("After Adding : ");

        cntry.addFirst("Isle of Man");
        cntry.addLast("Iraq");

        for (String i:cntry
        ) {
            System.out.println(i);
        }
    }
}
