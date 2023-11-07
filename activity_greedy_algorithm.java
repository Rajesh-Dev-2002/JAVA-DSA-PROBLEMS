import java.util.*;
import java.util.ArrayList;
public class activity_greedy_algorithm {
    public static void main(String []args){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        //we sorted greedy/act. with end term
        int maxAct=0;
        //we have to also find the ans of the greedy algorithm it always store only numbers
        ArrayList<Integer> ans = new ArrayList<>();


        // 1 activity 
        maxAct =1;
        //ans is always started with zero
        ans.add(0);
        int lastend = end[0];
        for(int i=0;i<end.length;i++){
            if (start[i] >= lastend) {
                maxAct++;
                ans.add(i);
                lastend = end[i];

                
            }

        }
        System.out.println("Maximum activies is to be :"+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }

    }

    
}
