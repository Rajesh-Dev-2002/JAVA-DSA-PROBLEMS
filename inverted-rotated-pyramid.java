import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
           int num=4;
        for (int i=1;i<=num ;i++ ) {
            for(int j=1;j<=num-i;j++ ){
                System.out.print(" ");
            }
            for (int j=1;j<=i ;j++ ) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
