package Arrays;
import java.util.*;

public class reverseArray {
    public static void reverse(int arr[]) {
        int t;
        // Swapping elements of the array
        for (int i = 0; i < arr.length / 2; i++) {
            t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }
        System.out.println("Reversed Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String args[]) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array : ");
            n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter array elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            reverse(arr);
        } catch (InputMismatchException e) {
            System.out.println("Exception Caught..Wrong input value.");

        }
    }
}