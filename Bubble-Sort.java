import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void BubbleSort(int arr[]){
        int temp=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
            
}
    }
    public static void main(String[] args) {
        int arr[]={25,45,1,96,5,84,32,3};
        BubbleSort(arr);
        
            
    }
}
