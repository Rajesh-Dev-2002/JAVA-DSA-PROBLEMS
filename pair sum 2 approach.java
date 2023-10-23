import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static boolean secPair(ArrayList<Integer>list , int target){
        int a=0;
        int b = list.size()-1;
        while (a != b) {
             if(list.get(a)+list.get(b)==target){
            return true;
        }
        if(list.get(a)+list.get(b)<target){
            a++;
            
            
        }
            else{
                b--;
            }
            
        }
        return false;

       
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target= 5;
       
         System.out.println(secPair(list,target));
       
    }
}
