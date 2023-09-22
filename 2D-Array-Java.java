import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
//we have to assign two for loop for that 2d array i.e- one for row and 
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[3][3];
        int m = matrix.length;//for rows
        int n = matrix[0].length;//for column
        for(int i=0;i<m;i++){
            for (int j=0;j<n ;j++ ) {
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for (int j=0;j<n ;j++ ) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        
    }
}
