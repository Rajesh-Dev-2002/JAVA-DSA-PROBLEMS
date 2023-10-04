import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
interface A{
    void dance();
}
interface B{
    void eat();
}

class C implements A,B{
    public void dance(){
        System.out.println("Iam Dancing ");
    }
    public void eat(){
        System.out.println("Iam eatng ");
    }
}

class Main {
    public static void main(String[] args) {
        C ccc = new C();
        ccc.dance();
        ccc.eat();
    }
}
