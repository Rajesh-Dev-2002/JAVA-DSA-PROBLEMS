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

        // to find the maximum number in an arraylist

        // int max = list.get(0);
        // for (int i = 1; i < list.size(); i++) {
        //     if (max < list.get(i)) {
        //         max = list.get(i);
        //     }
        // }
             

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(max,list.get(i));
        }



        System.out.print(max +" ");

    }
}
