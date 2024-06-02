/* Find if any pair in a Sorted ArrayList has a target sum. */
// 2-pointer approach

package ArrayList;
import java.util.ArrayList;

public class PairSum {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int i = 0, j = list.size() - 1;
        while (i != j) {
            if (list.get(i) + list.get(j) == target)
                return true;
            else if (list.get(i) + list.get(j) < target)
                i++;
            else
                j--;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum(list, target));
    }
}
