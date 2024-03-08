public class Billion {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        long stop;
        System.out.println("Start");
         for(int i=0; i<1000000001; i++){
            if(i==1000000000){
                System.out.println("End");
                stop = System.currentTimeMillis();
                System.out.println((float) ((stop-start))+"ms");
                
            }
         }
    }
}
