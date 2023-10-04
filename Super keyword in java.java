import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
// iplementatio of the super keyword
class Main {
    public static void main(String[] args) {
        dogs d = new dogs();
     System.out.println(d.name);

        
    }
}

class Animals{
     String name;
    Animals(){
       
        System.out.println("Parent class constructor is called");
    }
    
}

class dogs extends Animals{
    
    dogs(){
        super.name="Cheetah";
        System.out.println("Child clas constructor is calling");
    }
}
