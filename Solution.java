class Solution {

    public static void main(String[] args){
        String s = "words and _987";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        
        int len = s.length();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<len; i++){
if(Character.isDigit(s.charAt(i))){
    res.append(s.charAt(i));
}else if(s.charAt(i)=='+' || s.charAt(i) == '-'){
    res.append(s.charAt(i));
}
        }
        int resX = Integer.parseInt(res.toString());
        return resX;
    }
}
