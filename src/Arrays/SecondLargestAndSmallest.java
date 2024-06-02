package Arrays;
import java.util.*;

public class SecondLargestAndSmallest {
    public static int[] findSecondLargestAndSmallest(int[] arr, int size) {
        if (size < 2) {
            throw new IllegalArgumentException("Array should have at least two elements.");
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            // Finding Second Smallest
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
            // Finding Second Largest
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return new int[]{ secondLargest, secondSmallest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        int[] result = findSecondLargestAndSmallest(arr, size);
        System.out.println("Second Largest : " + result[0]);
        System.out.println("Second Smallest : " + result[1]);
        sc.close();
    }
}