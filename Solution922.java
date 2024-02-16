import java.util.ArrayList;

class Solution922 {

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        int[] res = sortArrayByParityII(nums);
        
        for (int num : res) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortArrayByParityII(int[] nums) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for (int num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = even.remove(0);
            } else {
                result[i] = odd.remove(0);
            }
        }

        return result;
    }
}
