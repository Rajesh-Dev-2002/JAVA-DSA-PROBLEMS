import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n ;i++ ) {
            for (int j=1;j<=i ;j++ ) {
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                     System.out.print("0"+" ");
                }
            }
             System.out.println();
        }
    }
}
