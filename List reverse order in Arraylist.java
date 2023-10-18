import java.util.ArrayList;
import java.util.Collections;
public class arraylist{
    public static void main(String[] args){
        ArrayList<Integer>list= new ArrayList<>();
        list.add(20);
        list.add(400);
        list.add(8780);
        list.add(120);
        list.add(10);
        
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
            System.out.println(list);
    }
}
