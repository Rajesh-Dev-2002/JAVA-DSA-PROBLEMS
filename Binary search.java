import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int binarySearch(int numbers[],int key){
        int start =0;
        int end = numbers.length-1;
        int mid= (start+end)/2;
        while (start<=end) {
            
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,56,74,50,23,54,69};
        int key=50;
        System.out.println(binarySearch(arr,key));
    }
}
