import java.util.ArrayList;

public class ArrayLst {
    public static void main(String[] args){

        ArrayList<String> city = new ArrayList<>();
        city.add("Delhi");
        city.add("New York");
        city.add("Dubai");
        city.add("Paris");

        System.out.println("ArrayList : ");
        for (String i :city
             ) {
            System.out.println(i);
        }
    }
}
