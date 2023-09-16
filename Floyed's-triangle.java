import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int n =5;
        int count =1;
        for (int i=1;i<=n ;i++ ) {
            for (int j=1;j<=i ;j++ ) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
