import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
     king k = new king();
        k.moves();
    queen q = new queen();
        q.moves();
    }
}
//implementation of the interface
interface chessPlayer{
    void moves();// for all classes
}
class queen implements chessPlayer{
    public void moves(){
          System.out.println("Moves in all 4 directions");
    }
} 
class king implements chessPlayer{
    public void moves(){
          System.out.println("Moves in only one dirctions");
    }
}
