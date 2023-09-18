import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int arr[]={4,9,3,1,5,45,69};
        int max=0;
        for (int i=0;i<arr.length ;i++ ) {
            if (arr[i]>max) {
                max=arr[i];
                
            }
       
        }
        System.out.println(max);

        //  for (int i=0;i<arr.length ;i++ ){
        //     System.out.println(max);
        // }
        
    }
}
