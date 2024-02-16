class Solution11 {

    public static void main(String[] args){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int res =0;
        int resX = 0;
        int j = height.length;
        int len = height.length;

        // for(int i=0; i<height.length; i++){
        //     for(int j=height.length -1; j>=0; j--){
        //         res = Math.min(height[i], height[j]) * (j-i);
        //         resX = Math.max(res, resX);
        //     }
        // }

        // return resX;
        if(len%2!=0){
len +=1;
        }

        for(int i=0; i<(len/2); i++){
            
            res = Math.min(height[i], height[j]) * (j-i);
                 resX = Math.max(res, resX);
                 j -=i;

        }
        return resX;
    }
}