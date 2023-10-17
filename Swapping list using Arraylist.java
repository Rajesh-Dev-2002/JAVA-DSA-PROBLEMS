import java.util.ArrayList;;

public class arraylist {
    public static void SwappingArraylist(ArrayList<Integer>list,int idx,int idx2){
        int temp = list.get(idx);
        list.set(idx,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // for add the element in the list
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(6);
        // Swapping of the two number in an arraylist
        System.out.print(list + " ");
        int idx = 1;
        int idx2=3;
        SwappingArraylist(list,idx,idx2);

    }
}
