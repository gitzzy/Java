class Solution454 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        int res;
        int count =0;

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums1.length; j++){
                for(int k=0; k<nums1.length; k++){
                    for(int l=0; l<nums1.length; l++){
res = nums1[i] + nums2[j] + nums3[k] + nums4[l];
if(res==0){
count +=1;
}
                    }
                }
            }
        }

       

        return count;
    }

    public static void main(String[] args){

        int[] nums1 ={1,2};
        int[] nums2 ={-2,-1};
        int[] nums3 ={-1,2};
        int[] nums4 ={0,2};

        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }
}
