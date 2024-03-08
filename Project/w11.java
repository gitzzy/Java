public class w11 {
    public static void main(String[] args) {
        
      
        Integer c = new Integer("786");
        Integer d = new Integer("786");

        Float a = new Float("3");
        Float b = new Float("3");
        System.out.println(a.hashCode());
        System.out.println(a.hashCode() == b.hashCode());
System.out.println(c.hashCode());

        System.out.println(c.hashCode() == d.hashCode());
        // System.out.println(c.hashCode());
        // System.out.println(d.hashCode());
    
        String a1 = new String("S");
        String a2 = "S";

    
        // System.out.println(obj1.hashCode() == obj2.hashCode());
        // System.out.println(a == b);
        // System.out.println(a==c);
        // System.err.println(a1==a2);
        w11 obj1 = new w11(5);
        w11 obj2 = new w11(5);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());


    }
    private int a;
    w11(int a){
this.a = a;
    }
}
