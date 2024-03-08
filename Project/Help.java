import java.util.Scanner;

public class Help {
    static Scanner scn;
    static int count = 0;
    static Books[] obj1;
    static int bId;
    static Lib objLib = new Lib();
    static Books oBooks;

    public static void main(String[] args) {

        int option;
        scn = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Book.");
            System.out.println("2. View Book.");
            System.out.println("3. Exit");
            System.out.print("Type 1/2/3 : ");
            option = scn.nextInt();

            if (option == 1) {
                System.out.print("Enter Book Id : ");
                bId = scn.nextInt();
                scn.nextLine();
                System.out.print("Entre Book Name : ");
                String bName = scn.nextLine();
                // System.out.print("Is your book avilable : ");
                // boolean isAvi = scn.nextBoolean();
                // scn.nextLine();
                boolean isAvi = true;
                System.out.print("Name of Author : ");
                String bAuthor = scn.nextLine();
                Books obj = new Books(bId, bName, isAvi, bAuthor);
                objLib.Save(obj);
            } else if (option == 2) {
                System.out.println("Enter Book Id : ");
                bId = scn.nextInt();
                scn.nextLine();
                objLib.Dis(bId);

            } else if (option == 3) {
                // exit
                return;
            } else {
                // invalid
            }
        }
    }
}

class Books {

    int bId;
    String bName;
    boolean isAvi;
    String bAuthor;

    public Books(int bId, String bName, boolean isAvi, String bAuthor) {
        this.bId = bId;
        this.bName = bName;
        this.isAvi = isAvi;
        this.bAuthor = bAuthor;
    }

}

class Lib extends Help {

    public void Save(Books obj2) {
        count += 1;
        obj1 = new Books[count];
        obj1[count - 1] = obj2;
    }

    public void Dis(int idd) {
        
        System.out.println("Book Name : "+obj1[(idd-1)].bAuthor);
        // for(int i=0; i<count; i++){
        //     if(idd == obj1[i].bId){
        //         System.out.println("Book Found : --->");
        //         System.out.println("Book Name : "+obj1[i].bAuthor);
        //     }
        // }
    }
}
