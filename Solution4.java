import java.util.ArrayList;
import java.util.Arrays;

class Solution4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len = nums1.length + nums2.length;
        double res;
        ArrayList<Integer> mArr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            mArr.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            mArr.add(nums2[i]);
        }
        mArr.sort(null);
        System.out.println(mArr.toString());

        if(len%2==0){
            int n1 = (len/2)-1;
            int n2 = len/2;
            // System.out.println(n2+","+n1);
            System.out.println(mArr.get(n1)+","+mArr.get(n2));
             res = (mArr.get(n1) + mArr.get(n2));
            //  System.out.println("res "+res);
            return res/2;
        }else{
            res = mArr.get(((len+1)/2)-1);
            return res;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2};
        int[] nums2 = { 3,4 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}