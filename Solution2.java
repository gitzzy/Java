//leetcode 1014
public class Solution2 {

    public  int maxScoreSightseeingPair(int[] values) {
        
        int res =0;
        int temp;
        for(int i=0; i<values.length; i++){
            for(int j=i+1; j<values.length; j++){
                temp = values[i] + values[j] + i - j;
                if(res<temp){
res = temp;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] values = {8,1,5,2,6};
        Solution2 sol = new Solution2();
System.out.println(sol.maxScoreSightseeingPair(values));
    }
}
