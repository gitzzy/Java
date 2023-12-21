public class Stock {
    public static void main(String[] args){

        int[] Arr={92,55,48,85,58,70,82,15,57,17};
        int Len = Arr.length;
        int dif;
        int buy=0;
        int sell=0;
        int Res = 0;

        for(int i=0; i<Len; i++){
            for(int j=i+1; j<Len; j++){
                dif = Arr[j] - Arr[i];
if(dif>Res){
    Res=dif;
    buy = i+1;
    sell = j+1;
}
            }
        }
        if(Res==0){
            System.out.println("Pussy go and Study ");
        }else {
            System.out.println("Buy At Day : " + (buy));
            System.out.println("Sell At Day : " + (sell));
            System.out.println("Maxime Profite : " + Res);
        }
    }
}
