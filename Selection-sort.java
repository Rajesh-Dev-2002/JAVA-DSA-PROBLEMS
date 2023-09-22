import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]= arr[i];
            arr[i]=temp;
        }
        for (int i=0;i<arr.length ;i++ ) {
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={5,8,6,2,3,7,1,4,9};
        SelectionSort(arr);
        
        
    }
}
