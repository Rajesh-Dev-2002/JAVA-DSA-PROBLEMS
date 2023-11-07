import java.util.*;
// knapsak algorithm in greedy algorithm
public class knapsak_greedy_algo {
    public static void main(String[] args){
        int val[]={60,100,120};
        int wei[] = {10,20,30};
        //0th ele idx , 1st ele ratio
        int w = 50;
        //rearrange 
        double ratio [][]= new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]= val[i]/(double)wei[i];
        }
        // order in ascending order with lamda expression
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
       // but we have to arrange in the descending order
       int capacity =w;
       int finalans=0;
       for(int i = ratio.length-1;i>=0;i--){
        //it must be initialised
        int idx =(int) ratio[i][0];
        if (capacity>=wei[idx]) {
            finalans += val[idx];
            capacity -= wei[idx];
            
        }
        else{
            finalans += ratio[i][1] * capacity;
            capacity=0;
            break;

        }


       }

       System.out.println("final answer is to be:"+finalans);

    }
    
}
