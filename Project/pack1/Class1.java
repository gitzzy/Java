package pack1;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {

        int[] i1 = new int[5]; int[] p1 = new int[5]; int[] q1=new int[5];
        Scanner scn = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.print("Enter Product ID : ");
        i1[i]= scn.nextInt();
        System.out.print("Enter Product Price : ");
        p1[i] = scn.nextInt();
        System.out.print("Enter Product Qt : ");
        q1[i] = scn.nextInt();
        scn.nextLine();
        System.out.println();
        }
        scn.close();
        System.out.println("Total Amount Spend : "+tAmnt(i1,p1,q1));

        int temp;
        for(int i=0; i<5; i++){
            for(int j=i+1; j<5; j++){
                
                if(p1[i]<p1[j]){
temp = p1[i];
p1[i] = p1[j];
p1[j] = temp;

temp = i1[i];
i1[i] = i1[j];
i1[j] = temp;

temp = q1[i];
q1[i] = q1[j];
q1[j] = temp;

                }
            }
        }
        Product obj = new Product(i1[0],p1[0],q1[0]);
        
    }
    public static int tAmnt(int[] i1, int[] p1, int[] q1){
int res =0;

for(int i=0; i<5; i++){
res += p1[i] * q1[i];
}

        return res;
    }
}
