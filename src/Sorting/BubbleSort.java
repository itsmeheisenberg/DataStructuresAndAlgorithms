package Sorting;

import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        boolean swapped;
        int totalSwaps = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) { // ascending order
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    totalSwaps++;
                }
            }
            if (!swapped)
                break;

        }
        System.out.println("Total number of swaps: " + totalSwaps);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements\n");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]" + " = ");
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("Sorted Array");
        printArr(arr);
        sc.close();
    }

}
