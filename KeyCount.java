
import java.util.Scanner;
import java.util.Stack;

public class KeyCount {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print ("Enter Your Word : ");
        String Word = scn.nextLine();
        scn.close();
        Stack<Character> wrd = new Stack<>();
        Stack<Integer> num = new Stack<>();
        int count = 0;

        char char1 ;
        for(int i=0; i<Word.length(); i++){
char1 = Word.charAt(i);
wrd.push(char1);
        }

char words;
        for(int i=Word.length(); i>0; i--) {
            words = wrd.peek();
            wrd.pop();

            switch (words) {

                case 'a':
                    num.push(2);
                    count +=1;
                    break;
                case 'b':
                    num.push(22);
                    count +=2;
                    break;
                case 'c':
                    num.push(222);
                    count +=3;
                    break;
                case 'd':
                    num.push(3);
                    count +=1;
                    break;
                case 'e':
                    num.push(33);
                    count +=2;
                    break;
                case 'f':
                    num.push(333);
                    count +=3;
                    break;
                case 'g':
                    num.push(4);
                    count +=1;
                    break;
                case 'h':
                    num.push(44);
                    count +=2;
                    break;
                case 'i':
                    num.push(444);
                    count +=3;
                    break;
                case 'j':
                    num.push(5);
                    count +=1;
                    break;
                case 'k':
                    num.push(55);
                    count +=2;
                    break;
                case 'l':
                    num.push(555);
                    count +=3;
                    break;
                case 'm':
                    num.push(6);
                    count +=1;
                    break;
                case 'n':
                    num.push(66);
                    count +=2;
                    break;
                case 'o':
                    num.push(666);
                    count +=3;
                    break;
                case 'p':
                    num.push(7);
                    count +=1;
                    break;
                case 'q':
                    num.push(77);
                    count +=2;
                    break;
                case 'r':
                    num.push(777);
                    count +=3;
                    break;
                case 's':
                    num.push(7777);
                    count +=4;
                    break;
                case 't':
                    num.push(8);
                    count +=1;
                    break;
                case 'u':
                    num.push(88);
                    count +=2;
                    break;
                case 'v':
                    num.push(888);
                    count +=3;
                    break;
                case 'w':
                    num.push(9);
                    count +=1;
                    break;
                case 'x':
                    num.push(99);
                    count +=2;
                    break;
                case 'y':
                    num.push(999);
                    count +=3;
                    break;
                case 'z':
                    num.push(9999);
                    count +=4;
                    break;
                case ' ':
                    num.push(0);
                    count +=1;
                default:
                    System.out.println("Un Recognized Letter");
                    break;

            }
        }
        System.out.println("Type This on KeyWord : "+num);
        System.out.println("Number of Count : "+count);

    }
}
