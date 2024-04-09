class Solution1544 {
    public static String makeGood(String s) {
        char[] ch = s.toCharArray();
        
        for(int i=0; i<ch.length-1; i++){
            if(Math.abs(ch[i]-ch[i+1]) == 32){
            }
        }
    }
    public static void main(String[] args){
        String s = "leEeetcode";
        System.out.print(makeGood(s));
    }
}
