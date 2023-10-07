import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int powerCalculate(int x , int n){
        if(n==0){
            return 1;
        }
        // they have capability to cal the the pow function
        int xnm1= powerCalculate(x,n-1);
        // int xnm1= powerCalculate(pow(x,(n-1)));
        
        int xn=x*xnm1;
        return xn;
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(powerCalculate(x,n));
    }
}
