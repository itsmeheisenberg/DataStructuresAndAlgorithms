package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InbuiltSort {
    public static void main(String args[]) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        int [] tempArr = new int [n];
        System.out.print("Enter array elements\n");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]" + " = ");
            arr[i] = sc.nextInt();
            tempArr[i]=arr[i];
        }
        System.out.println("Enter starting and ending index : ");
        int si = sc.nextInt();
        int ei= sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Full Sorted Array");
        printArr(arr);
        System.out.print("Partially Sorted Array (ending index is exclusive) : ");
        Arrays.sort(tempArr,si,ei);
        printArr(tempArr);
        sc.close();
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int compare(int a, int b) {
        // a < b  -ve
        // a == b  0
        // a > b  +ve

        return a-b;
    }
}
// Time Complexity : O(n log n)


/*  import java.util.Collections;

For Reverse(Descending order) Order
Arrays.sort(arr,Collections.reverseOrder())

Arrays.sort(arr,si,ei,Collections.reverseOrder())

Change int to Integer everywhere
*/