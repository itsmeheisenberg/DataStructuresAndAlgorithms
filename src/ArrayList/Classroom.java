package ArrayList;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(87);
        list.add(44);
        System.out.println(list);
        System.out.println("size of array list : "+list.size());

        System.out.println(list.get(2));

        //Delete Element
        list.remove(2);
        System.out.println(list);

        list.set(0, 10);
        System.out.println(list);

        System.out.println(list.contains(10));
        System.out.println(list.contains(14));


        list.add(0, 12); // O(n)
        System.out.println(list);

        list.add(16);
        list.add(19);


        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Maximum in array list: O(n)

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if(max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Max Element : " + max);

    }
}

/*
 * Add Element : O(1)
 * Get Element : O(1)
 * Remove Element : O(n)
 * Set Element at index : O(n)
 * Contains Element : O(n)
 */