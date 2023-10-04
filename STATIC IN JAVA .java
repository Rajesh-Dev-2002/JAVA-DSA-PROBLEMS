import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        student s = new student();
            String ss=s.School="RNHS";
        System.out.println(ss);
        student sss = new student();
            System.out.println(sss.School);// o/p;- is same as the s object thats why static is able retaned all values in same for all other functions and variables.
        
    }
}

class student {
    String name;
    int age;
   static String School;
    void dept(){
        System.out.println("Java Programkmbng");
    }
    void org(){
        System.out.println("Naresh It Technology");
    }
}
