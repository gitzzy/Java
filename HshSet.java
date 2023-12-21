import java.util.HashSet;

public class HshSet {
    public static void main(String[] args){

        HashSet<Character> hs = new HashSet<>();
        String Name = "aabbbcczzzyyy";

        for(int i=0; i<Name.length(); i++){
            char c = Name.charAt(i);
hs.add(c);
        }
System.out.println("Original Data : "+Name);
        System.out.print("Data in HashSet : ");
        for (char i:hs
             ) {
            System.out.print(i);
        }
    }
}

