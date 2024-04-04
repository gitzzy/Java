import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

class Solution1614 {
    public static int maxDepth(String s) {
        int res = 0;
        ArrayList<Integer> hs1 = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(' || s.charAt(i) != ')') {
                for (int j = i - 1; j >= 0; j--) {
                    if (s.charAt(j) == '(') {
                        res += 1;
                    } else if (s.charAt(j) == ')') {
                        res -= 1;
                    }
                }
                hs1.add(res);
                res = 0;
            }
        }
        Collections.sort(hs1);
        return hs1.getLast();
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
}
