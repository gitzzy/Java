import java.util.Stack;

class Solution1 {
    public String reverseWords(String s) {
        
        StringBuilder rWord = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
        char a = s.charAt(i);

        if(a != ' '){
st.push(a);
        }else{
            while(st.size() != 0){
rWord.append(st.pop());
        }
        rWord.append(' ');
        }
        
        }

        while(st.size() != 0){
rWord.append(st.pop());
        }
String res1 = rWord.toString();
return res1;
    }
    public static void main(String[] args){

        Solution1 sol = new Solution1();
        String res = sol.reverseWords("Hello how are you");
        System.out.println(res);
    }
}
