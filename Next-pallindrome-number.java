import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void FindNextPallindromeNumber(int n){
        int temp;
        int sum=0;
        int rem=0;
        while (true) {
            n++;
            sum=rem=0;
            temp=n;
            while (temp>0) {
                rem = temp%10;
                sum= sum*10+rem;
                temp=temp/10;
            }
            if (sum==n) {
                System.out.println("The next pallindrome number is :"+n);
            break;
            }
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number for next pallindrome number");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Please enter a valid number");
        }
        else{
            FindNextPallindromeNumber(n);
        }
        
    }
}
