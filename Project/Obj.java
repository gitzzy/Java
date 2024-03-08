public class Obj {
    public static int count = 0;
    public static void main(String[] args) {
        
        Check o = new Check();
        Check o1 = new Check();
        o.dis(0);
        o.dis(1);
        o1.dis(2);
    }
}

class Check{
    
    Check(){
        System.out.println(" Object Created");
    }
    public void dis(int a){
System.out.println("Hello : "+a);

    }

}
