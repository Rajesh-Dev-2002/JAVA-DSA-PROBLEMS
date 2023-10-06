import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
// first occurance in an array
class Main {
    public static int findFirstOccurance(int arr[],int key ,int i){
        // this is the base case , (if i doesn't meet the intial condition )
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return findFirstOccurance(arr,key,i+1);
        
    }
    
    public static void main(String[] args) {
        int arr[]={7,6,9,5,6,8,2,5};
        int i =0;
        System.out.println(findFirstOccurance(arr,5,i));
    }
}
