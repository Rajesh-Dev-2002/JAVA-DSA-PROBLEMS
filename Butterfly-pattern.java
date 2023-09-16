import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int n=5;
        //1st half
        for(int i=1;i<=n;i++){
            //start print
            for (int j=1;j<=i ;j++ ) {
                System.out.print("*");
            }
            //space print
            for (int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }

             for (int j=1;j<=i ;j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for (int i=n;i>=1;i-- ) {
             //start print
            for (int j=1;j<=i ;j++ ) {
                System.out.print("*");
            }
            //space print
            for (int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }

             for (int j=1;j<=i ;j++ ) {
                System.out.print("*");
            }
            System.out.println();
            
            
        }
    }
}
