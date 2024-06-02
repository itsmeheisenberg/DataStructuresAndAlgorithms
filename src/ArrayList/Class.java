package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class Class {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(71);
        list.add(8);
        list.add(27);
        list.add(15);
        list.add(13);

        int idx1 = 1, idx2 = 4;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        //Descending Order
        Collections.sort(list, Collections.reverseOrder()); // comparator
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
}
