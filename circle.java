import java.text.DecimalFormat;
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        
        float pi = (float) Math.PI;
        int r = 2;
        float Area = 2*pi*r;
        double pi2 = 3.14;
        DecimalFormat ft = new DecimalFormat("#.00");
        String res = ft.format(Area);
        double Area2 = 2*pi2*r;
        System.out.println(res);

        
    }
}
