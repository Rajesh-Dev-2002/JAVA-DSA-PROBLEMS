import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        chiken c = new chiken();
        c.walk();
        tiger t = new tiger();
        t.walk();
    }
}

abstract class Animals{
    void eats(){
        System.out.println("Animals are able to eats");
    }
    // we can't implementate the abs. class 
    abstract void walk();
}

class tiger{
    void walk(){
        System.out.println("They are walk on 4 legs");
    }
}
class chiken{
    void walk(){
        System.out.println("they are walk on 2 legs 🚀");
    }
}
