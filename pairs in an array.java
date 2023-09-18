import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void pairsInArray(int arr[]){
        for (int i=0;i<arr.length ;i++ ) {
             int curr=arr[i];
            for (int j=i+1;j<arr.length ;j++ ) {
                System.out.print("("+curr+","+arr[j]+")");
            }
        }
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        pairsInArray(arr);
    }
}
