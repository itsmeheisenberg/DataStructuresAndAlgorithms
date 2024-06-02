package Arrays;

import java.util.*;

public class arrayPairs {
    public static void printPairs(int[] arr) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array : ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter array elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Pairs of given array");
            printPairs(arr);
        } catch (InputMismatchException e) {
            System.out.println("Exception Caught..Wrong input value.");

        }
    }
}

// Time Complexity : O(n^2)
