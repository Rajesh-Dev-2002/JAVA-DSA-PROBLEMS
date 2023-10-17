import java.util.ArrayList;;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // for add the element in the list
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(6);
       // print reverse of an arraylist
       for(int i =list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+" ");
       }
       }
    }
