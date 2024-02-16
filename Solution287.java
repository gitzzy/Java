import java.util.Stack;

class Solution287 {

    public static void main(String[] args){

        String s = "leet";
        int res = firstUniqChar(s);
        System.out.println(res);
    }
    public static int firstUniqChar(String s) {
        int len = s.length();
        if(len==1){
            return 0;
        }else if(len>=2){
            Stack<Character> st1 = new Stack<>();
        for(int i=0; i<len; i++){
            st1.push(s.charAt(i));
        }
        
        for(int i=0; i<len; i++){
for(int j=0; j<len; j++){
    if(st1.pop() == s.charAt(j)){
break;
    }
    if(st1.isEmpty()){
        return Math.abs(len-j);
    }
}

        }
        }
        return -1;
    }
}