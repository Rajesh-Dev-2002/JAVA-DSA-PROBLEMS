import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void printSorted(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void mergeSort(int arr[],int str,int end){
        if(str>=end){
            return;
        }
        int mid= (str+end)/2;
        mergeSort(arr,mid,str);//left sorted part
        mergeSort(arr,mid+1,end);//right sorted part
            merge(arr,str,end,mid);
        
    }
    public static void merge(int arr[],int str ,int end , int mid){
        int i = str;
        int j = mid+1;
        int k = 0;
        int temp [] = new int[end-str+1];//size of the temp array with element
        while(i <= mid && j<=end){
            if(arr[i] <arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=end) {
            temp[k++]=arr[j++];
        }
        for(i=str,k=0;k<=temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
    int arr[]={2,6,4,1,9,3,7,5};
        mergeSort(arr,0,arr.length);
        printSorted(arr);
    }
}
