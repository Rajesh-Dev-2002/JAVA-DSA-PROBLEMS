import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static String CompressString(String str){
        String cmpstr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && (str.charAt(i)==str.charAt(i+1))){
                count++;
                i++;
            }
            cmpstr+=str.charAt(i);
            if(count>1){
                cmpstr+=count.toString();
            }
        }
        return cmpstr;
    }
    public static void main(String[] args) {
        String str = "aaccdddee";
        System.out.println(CompressString(str));
    }
}
