import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Student s1= new Student("Rajesh");
        System.out.println(s1.name);
        
    }
}

class Student {
    String name;
    int mark;
    Student(String name){
        // System.out.println();
        this.name=name;
    }
}
