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
        // System.out.println(list);
        // to get the element in java
        // int x = list.get(3);
        // System.out.println(x);

        // remove the element in a list

        // System.out.println(list.remove(0));
        // System.out.println(list);

        System.out.println(list.contains(9));
    }
}
