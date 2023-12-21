class Earth{

    String livingbeings;
    String Elements;

    public void print(){
        System.out.println("Made by Gods");
    }

    Earth(Earth e3){
        this.livingbeings = e3.livingbeings;
        this.Elements = e3.Elements;
    }

    Earth(){

    }

}

public class CopyCon{
    public static void main(String[] args) {
        Earth e1 = new Earth();

        e1.livingbeings = "Humans";
        e1.Elements = "Water";

        Earth e3 = new Earth(e1);

        e3.print();
    }
}
