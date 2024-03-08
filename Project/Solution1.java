class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length-1;
        int j;
        int[] res = new int[2];
        for(int i=0; i<len; i++){
            j= i+1;
            if(nums[i] + nums[j] == target){
res[0] = nums[i];
res[1] = nums[j];
            }
        }
return res;
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] p = twoSum(nums,target);
        System.out.println(p);
    }
}