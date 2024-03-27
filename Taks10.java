import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Taks10 {
    public static void main(String[] args) {
        int[] arr = {3,3,2,2,1,1};
        Arrays.sort(arr);
        HashSet<Integer> del = new HashSet<>();
        for (Integer i : arr) {
            del.add(i);
        }
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> ar1 = new HashSet<>();
        HashSet<Integer> ar2 = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
ar2.add(arr[j]);
                }else{
                    ar1.add(arr[j]);
                }
            }
        }
        
        res.addAll(ar1);
        res.addAll(ar2);
        for(int i=0; i<del.size()-1; i++){
            res.removeFirst();
        }
        System.out.println(res.toString());
        
      


    }
}
