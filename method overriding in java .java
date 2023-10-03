import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        odisha O = new odisha();
        O.des();
    }
}

class india{
    void des(){
        System.out.println("I love my India");
    }
}

class odisha extends india{
    void des(){
        System.out.println("I love my Odisha");
    }
}
