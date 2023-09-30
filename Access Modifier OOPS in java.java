import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.Password("abcd");
        System.out.println(b.Password);
    }
}
class Bank{
    public String nameBank;
    private String Password;
    public void ChangePswd(String pwd){
        Password=pwd;
    }
}
