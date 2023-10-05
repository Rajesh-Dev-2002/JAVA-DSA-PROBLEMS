import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
// recursion at a glance


class Main {

    public static void decrNum(int n){
         // System.out.println(n);
        // decrNum(n-1);
   
    if(n>0){
        System.out.println(n);
        decrNum(n-1);
    
    return;
    }
    
}
    public static void main(String[] args) {
        int n=5;
        decrNum(n);
    }


}
