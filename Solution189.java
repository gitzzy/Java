import java.util.ArrayList;

class Solution189 {

    public static void main(String[] args){
        int[] nums ={-1,-100,3,99};
        int k=2;
        rotate(nums,k);
    }
    public static void rotate(int[] nums, int k) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
arr.add(nums[i]);
        }
        for(int i=0; i<k; i++){
            arr.addFirst(arr.removeLast());
        }
        System.out.println(arr);
    }

   
}