import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
      Animals a = new Animals();
        a.demons("Tiger","Mbj");
        System.out.println(a.namee+" " + a.placee);
        students s = new students();
        s.per(95,86,97);
        System.out.println(s.mark);
    }
}

class Animals{
    String namee;
    String placee;
    void demons(String name,String place){
        namee=name;
        placee=place;
    }
}

class students{
    String name;
    int mark;
    void per(int phy,int math,int chem){
        mark= (phy+math+chem)/3;
    }
}
