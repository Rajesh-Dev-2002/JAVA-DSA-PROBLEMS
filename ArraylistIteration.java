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
       // now we have to find out the arraylist size
       System.out.println("size of the list "+ list.size());
       for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
       }
    }
}
