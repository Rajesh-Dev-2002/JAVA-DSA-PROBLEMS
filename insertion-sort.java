import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void InsertionSort(int arr[]){
        for (int i=1;i<arr.length ;i++ ) {
            int curr=arr[i];
            int prev = i-1;
            //this is for identifying the position of the eleement in that array
            while (prev >=0 && arr[prev] > curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertng the eleement in that prev arr from the curr arr
            arr[prev+1]= curr;
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={5,9,2,4,3};
        InsertionSort(arr);
    }
}
