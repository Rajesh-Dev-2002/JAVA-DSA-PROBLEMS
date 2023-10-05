import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int printFact(int n){
        if(n==0){
            return 1;
        }
        int fact = printFact(n-1);
        int fact1 = n*fact;
        return fact1;
        
    }
    public static void main(String[] args) {
        int n = 5;
       System.out.println( printFact(n));
    }
}
