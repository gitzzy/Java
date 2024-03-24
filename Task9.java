import java.util.ArrayList;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {1,-2,-3,-4,5,6,-7};
        int pair = 3;
        ArrayList<Integer> lists = new ArrayList<>();
        for(int i=0; i<arr.length-2; i++){
          for(int j=i; j<i+pair; j++){
            if(arr[j]<0){
                lists.add(arr[j]);
                // j=i+pair-1;
                break;
            }
          }
        }
        System.out.println("Result "+lists.toString());
    }
}
