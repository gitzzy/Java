public class Task1 {
    public static void main(String[] args) {
        
        String s1 ="vishal";
        String s2 ="vis";

        int l1 = s1.length();

        StringBuilder sb1 = new StringBuilder(s1);

        for(int i=0; i<s2.length(); i++){
            for(int j=0; j<l1; j++){
                // System.out.println(t1+" and "+t2);
                // System.out.println("index "+i+" and "+j);
                if(sb1.charAt(j) == s2.charAt(i)){
                    sb1.deleteCharAt(j);
                    l1=sb1.length();
                }
            }
        }

        System.out.println(sb1.toString());
    }
}
