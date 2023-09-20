import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int trapped_water(int height[]){
        int n = height.length;
         int trapped_wa=0;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i = n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        for(int i=0;i<n;i++){
           int min_value_of_both_Array= Math.min(leftMax[i],rightMax[i]);
            trapped_wa += min_value_of_both_Array-height[i];
            
}
        return trapped_wa;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapped_water(height));
    }
}
