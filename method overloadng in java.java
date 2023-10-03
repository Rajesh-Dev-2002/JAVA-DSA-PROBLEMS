import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        calculator C = new calculator();
        int x= C.sum(5,6);
        System.out.println(x);
        int y= C.sum(1,2,3);
         System.out.println(y);
        float z = C.sum((float)1.5,(float)2.5);
         System.out.println(z);
    }
}
class calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
