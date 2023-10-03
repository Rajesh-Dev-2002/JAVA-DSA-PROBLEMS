import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        math m = new math();
        m.cs_sub();
        m.phy_sub();
        
    }
}
class cs {
    String sub;
    void cs_sub(){
        System.out.println("Java Prog");
    }
    void cs_card(){
        System.out.println("254");
    }
}

class phy extends cs{
    String name;
    void phy_sub(){
        System.out.println("This is physics sub");
    }
    void phy_card(){
        System.out.println("356");
    }
}
class math extends phy{
    String namee;
    void math_sub(){
        System.out.println("This is Trigonometry");
    }
    void math_card(){
        System.out.println("856");
    }
}
