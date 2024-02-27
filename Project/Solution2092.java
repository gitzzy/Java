import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution2092 {
    public static List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {

        ArrayList<Integer> res = new ArrayList<>();
       //Time Sort
       Arrays.sort(meetings, Comparator.comparingInt(row -> row[2]));

       res.add(0);
       res.add(firstPerson);

       for(int i=0; i<meetings.length; i++){
        for(int j=i+1;j<meetings.length; j++){
            if(meetings[i][2] == meetings[j][2]){

                if(res.contains(meetings[i][0]) || res.contains(meetings[j][1])){
                    System.out.println("Checking "+meetings[i][0]+" and "+meetings[j][1]);
                }else{
                    System.out.println("Does not contain "+meetings[i][0]+" and "+meetings[j][0]);
                    int temp1 = meetings[i][1];
                    meetings[i][1] = meetings[j][1];
                    meetings[j][1] = temp1;
    
                    temp1 = meetings[i][0];
                    meetings[i][0] = meetings[j][0];
                    meetings[j][0] = temp1;
    
                }
               
            }
        }
       }

       for(int i=0; i<meetings.length; i++){
        for(int j=0;j<meetings[0].length; j++){
            System.out.print(meetings[i][j]+" ");
        }
    System.out.println();
}
       

       
        for(int i=0; i<meetings.length; i++){
            // System.out.println(meetings[i][0]+" met "+meetings[i][1]);
                if(res.contains(meetings[i][0]) || res.contains(meetings[i][1])){
                    // System.out.println("Contain "+meetings[i][0]);
                    System.out.println(meetings[i][0]+" met "+meetings[i][1]);
                    if(!res.contains(meetings[i][1])){
                        res.add(meetings[i][1]);
                        System.out.println("Add : "+meetings[i][1]);
                    }
                if(res.contains(meetings[i][1])){
                    System.out.println(meetings[i][0]+" met "+meetings[i][1]);
                    if(!res.contains(meetings[i][0])){
                        res.add(meetings[i][0]);
                        System.out.println("Add : "+meetings[i][0]);
                    }
                }
                
            }
        }
        res.sort(null);

        return res;
        
    }
    public static void main(String[] args) {
        int n=5;
        int[][] meetings = {{3,4,2},{1,2,1},{2,3,1}};
        int firstPerson = 1;


        System.out.println(findAllPeople(n, meetings, firstPerson));
    
    }
}
