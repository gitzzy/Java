public class Swastika {
    public static void main(String[] args) throws InterruptedException{
        
        int n = 9;
        int n1 = n-1;
        int n2= n1/2;
        Thread t1 = new Thread();
        
        for(int i=0; i<n; i++){
            Thread.sleep(100);
            for(int j=0; j<n; j++){
                if(i == n2 || j == n2 || (j==0 && i<=n2) || (i==0 && j>=n2) || 
                (i==n1 && j<=n2) || (j==n1 && i>=n2) || (i==2 && j==2) ||
                 (i==6 && j==6) || (i==2 && j==6) || (i==6 && j==2)){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

