import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        String sc[] = {"apple","mango","banana"};
        String largest = sc[0];
        for(int i=1;i<sc.length;i++){
            if(largest.compareTo(sc[i]) <0){
                largest = sc[i];
            }
        }
        System.out.println(largest);
    }
}
