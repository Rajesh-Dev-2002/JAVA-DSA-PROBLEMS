import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String org = sc.nextLine();
        String rev ="";
        int len = org.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+org.charAt(i);
           
        }
         if(org.equals(rev)){
                System.out.println("Pallidrom");
            }
            else{
                System.out.println("Not a pallindrome");
            }
    }
}
