import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){

        System.out.print("Input : ");
        Scanner scn = new Scanner(System.in);
        int inp = scn.nextInt();
        int res;
        scn.close();
        for(int i=0; i<inp; i++){
            for(int j=0; j<inp; j++){

res = inp-Math.min(i,j);
System.err.print(" "+res+" ");

            }
            System.err.println();
        }
    }
}
