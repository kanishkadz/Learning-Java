import java.util.ArrayList;
import java.util.Collections;

class CustomArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //adding elements
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get elements
        System.out.println(list.get(0));

        //add in betweeen
        list.add(1,1);

        //set element
        list.set(0,5);

        //remove element
        list.remove(0);

        //count element
        System.out.println(list.size());

        //sort elements
        Collections.sort(list);
        System.out.println(list);
    }
}
