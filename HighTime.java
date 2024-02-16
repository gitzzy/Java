public class HighTime{


    public static void main(String[] args) {
        int[] arr = {5,5,5,5}; 
        String res = largestTimeFromDigits(arr);
        System.out.println("start");
        System.out.println(res);

        
    }

    public static String largestTimeFromDigits(int[] arr) {
        
        StringBuilder  resx = new StringBuilder();
        int i=0;
        String con ;
        while(i != 3){
            i++;
            if(arr[i] == 2){
resx.append("2");
System.out.println(i);
break;
        }
    }
    con = resx.toString();
        return con;
    }
}