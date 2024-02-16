class Solution3014 {
    public static int minimumPushes(String word) {

        int len = word.length();
        char temp;
        int res=0;
        
        for(int i=0; i<len; i++){
            temp = word.charAt(i);
            if(temp == 'a' || temp == 'd' || temp == ' ' ||
             temp =='g' || temp == 'j' || temp =='m'
             || temp =='p' || temp =='t' || temp =='w'){
res += 1;
            }else if(temp == 'b' || temp == 'e' ||
            temp =='h' || temp == 'k' || temp =='n'
            || temp =='q' || temp =='u' || temp =='x'){
res += 2;
            }else if(temp == 'c' || temp == 'f' ||
            temp =='i' || temp == 'l' || temp =='o'
            || temp =='r' || temp =='v' || temp =='y'){
res += 3;
            }else if(temp == 's' || temp =='z'){
res += 4;
            }
        }
        
        return res;
    }
    public static void main(String[] args){

        System.out.println(minimumPushes("Devansh Tyagi"));
    }
}