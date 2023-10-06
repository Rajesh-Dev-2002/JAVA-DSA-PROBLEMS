import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int fibbonacci(int n){
        // here we define a base case for rcursion
        if(n==0 || n==1){
            return n;
        }
         int fn1= fibbonacci(n-1);
         int fn2= fibbonacci(n-2);
        int fn = fn1+fn2;
        return fn;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(fibbonacci(n));
    }
}
