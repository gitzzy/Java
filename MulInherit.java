interface IntA{
    void Fnc1();
}

interface IntB{
    void Fnc2();
}

class MulClass implements IntA, IntB{

    @Override
    public void Fnc1(){
        System.out.println("Hello from interface A");
    }
    @Override
    public void Fnc2(){
        System.out.println("Hello from interface B");
    }

}

public class MulInherit {

    public static void main(String[] args){
        MulClass obj = new MulClass();
        obj.Fnc1();
        obj.Fnc2();
    }
}
