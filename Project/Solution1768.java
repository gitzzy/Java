class Solution1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
 
        int len1 = word1.length();
        int len2 = word2.length();

        for(int i=0; i<Math.min(len1,len2); i++){
res.append(word1.charAt(i));
res.append(word2.charAt(i));
        }
        if(len1==len2){

        }else
        if(len1>len2){
            for(int i=len2-1; i<len1; i++){
                res.append(word1.charAt(i));
            }
        }else{
            for(int i=len1-1; i<len2; i++){
                res.append(word2.charAt(i));
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqr";

        System.out.println(mergeAlternately(s1, s2));
    }
}
