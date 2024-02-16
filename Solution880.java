public class Solution880  {
    public static void main(String[] args){

        String s = "oneone2"; //leetleetleet
        int k = 5;
        System.out.println("Answer : "+decodeAtIndex(s,k));

    }

    public static String decodeAtIndex(String s, int k) {
        
        StringBuilder resX = new StringBuilder();
        String res;
        char temp;

        for(int i=0; i<s.length(); i++){
temp = s.charAt(i);

if(Character.isDigit(temp)){
    int t = (int)temp;
    for(int j=0; j<t; t++){
        resX.append(resX);

    }

    }else{
        resX.append(temp);
    }
}
        res = resX.toString();
        return res;
    }
    }

