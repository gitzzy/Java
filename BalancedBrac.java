import java.util.Scanner;
import java.util.Stack;

public class BalancedBrac {
    public static void main(String[] args){

        System.out.print("Enter your Expression : ");
        Scanner scn = new Scanner(System.in);
        String Exp =scn.nextLine();
        scn.close();
        Stack<Character> brc = new Stack<>();
        char c;

        for(int i=0; i<Exp.length(); i++){
            char ch = Exp.charAt(i);
            if(ch == ')'){

                while(brc.peek() != '('){
                    brc.pop();
                }
                brc.pop();

            }else if(ch == '}'){
                while (brc.peek() != '{') {
                    brc.pop();
                }
                brc.pop();

            }else if (ch == ']') {
                while (brc.peek() != '[') {
                    brc.pop();
                }
                brc.pop();
            }else{
                brc.push(ch);
            }
        }
if(brc.isEmpty()){
    System.out.println("Balanced Bracket");
    System.out.println(brc);
}else{
    System.out.println("Unbalanced Bracket");
    System.out.println(brc);
}

    }
}
