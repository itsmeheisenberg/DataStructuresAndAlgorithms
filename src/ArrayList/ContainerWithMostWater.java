package ArrayList;
import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int storeWaterBruteForce(ArrayList<Integer> height) {
        int maxWater = 0;
        // Brute Force : O(n^2)
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int curWater = ht * width;
                maxWater = Math.max(maxWater, curWater);

            }
        }
        return maxWater;
    }

    public static int storeWaterOptimal(ArrayList<Integer> height) {
        int maxWater = 0;
        int leftPtr = 0;
        int rightPtr = height.size() - 1;
        //Optimal Approach : O(n)
        while (leftPtr < rightPtr) {
            int ht = Math.min(height.get(leftPtr), height.get(rightPtr));
            int width = rightPtr - leftPtr;
            int curWater = ht * width;
            maxWater = Math.max(maxWater, curWater);

            if (height.get(leftPtr) < height.get(rightPtr)) {
                leftPtr++;
            } else {
                rightPtr--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Using brute force approach: "+storeWaterBruteForce(height));
        System.out.println("Using optimal approach: "+storeWaterOptimal(height));
    }
}
