import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    public static void Hollw_pattern(int rows,int colmn){
        //outer loop printing for number of rows
        for(int i=1;i<=rows;i++){
            //inner loop printing for (i,j)-->
            for (int j=1;j<=colmn;j++ ) {
                if(i==1 || i==rows || j==1 || j==colmn){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
}
    }
    
    public static void main(String[] args) {

        Hollw_pattern(10,20);
        
    }
}
