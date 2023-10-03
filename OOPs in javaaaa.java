import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
       Fish f = new Fish();
        // f.eat();
        // f.sleep();
        f.size();
    }
}
// this is the parent class
class Animal{
    String name;
    void eat(){
         System.out.println("Eats and Dance");
    }
    void sleep(){
         System.out.println("Sleep and hunting for his dinner");
    }
}
// hs s the child class/ subclass
class Fish extends Animal{
    String name;
    void color(){
         System.out.println("Color is white and various color");
    }
    void size(){
         System.out.println("Is shape as like a multi big Ships");
    }
}
