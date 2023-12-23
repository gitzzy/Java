class Q1287{

    public int Sum(int[] Arr1){
        int c1=0;
    int tf = Arr1.length/4;

    if(Arr1.length == 1){
        return Arr1[0];
    }
        for(int i=0; i<Arr1.length; i++){
    for(int j=i+1; j<Arr1.length; j++){
        if(Arr1[i] == Arr1[j]){
            c1 +=1;
            if(c1 >= tf){
            return Arr1[i];
            }
        }else{
c1 = 0;
        }
    }
}
return 0;
    }
    public static void main(String[] args){

        Q1287 q = new Q1287();
    int[] Arr = {1};
    System.out.println(q.Sum(Arr));
        
    }
}