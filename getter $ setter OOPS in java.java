import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
       b.setBnk("BOI");
        b.setPsd(1234);
        System.out.println(b.getPsd());
        System.out.println(b.getBnk());
    }
}
class Bank{
    private String nameBank;
    private int Password;
    public void setBnk(String Bnk){
        this.nameBank=Bnk;
        // this.Password=Psd;
    }
    public void setPsd(int Psd){
        this.Password=Psd;
    }
    public int getPsd(){
        return this.Password;
    }
    public String getBnk(){
        return this.nameBank;
    }
    
    
}
