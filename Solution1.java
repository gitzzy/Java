import java.util.HashSet;

public class Solution1 {
    public static void main(String[] args) {
        
        int[] arr1 = {3,2,3,2};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        System.out.println(hs.iterator());
        System.out.println(Check(arr1));

    }
    public static boolean Check(int[] a1){

        for(int i=0; i<a1.length; i++){
            for(int j=i+1; j<a1.length; j++){
                if(a1[i] == a1[j]){
return true;
                }
            }
        }
        return false;
    }
}
