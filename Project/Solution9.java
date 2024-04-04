class Solution9 {

    public static void main(String[] args){
        String s = "Speed -42";
        System.out.println(myAtoi(s));
    }
    public static long myAtoi(String s) {
        
        int len = s.length();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<len; i++){
if(Character.isDigit(s.charAt(i))){
    res.append(s.charAt(i));
}else if(s.charAt(i)=='+' || s.charAt(i) == '-'){
    res.append(s.charAt(i));
}
        }
        long resX = Long.parseLong(res.toString());
        return resX;
    }
}
