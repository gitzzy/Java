
class Solution9a {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String x1 = Integer.toString(x);
        StringBuilder res = new StringBuilder();
        for(int i=x1.length()-1; i>=0; i--){
            res.append(x1.charAt(i));
        }
        int resX = Integer.parseInt(res.toString());
    
        if(x==resX){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args){

        int x = 121;
        System.out.println(isPalindrome(x));
    
    }
}