import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

import EasyXLS.b.al;

class Solution621 {
    public static int leastInterval(char[] tasks, int n) {
        int res =0;
        int cd=0;
        // HashSet<Character> hs1 = new HashSet<>();
        ArrayList<Character> al1 = new ArrayList<>();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<tasks.length; i++){
            st.push(tasks[i]);
        }
        st.reversed();
        System.out.println(st);
        int i=1;
        al1.add(st.pop());
       while(true){
if(st.isEmpty()){
    break;
}
for(int k=0; k<st.size(); k++){
    for(int j=n; j<0; j--){

    }
}


        
   
    }
    res= al1.size();
    return res;
}
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        int n=2;

        System.out.println(leastInterval(tasks, n));

    }
}