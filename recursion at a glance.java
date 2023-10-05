import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
// recursion at a glance


class Main {

    public static void decrNum(int n){
    if(n == 1){
    System.out.println(1);
    return;
    }
    decrNum(n-1);
    System.out.println(n);
}
    public static void main(String[] args) {
        int n=10;
        decrNum(n);
    }


}
