
// Brute Force Approach
package Arrays;
import java.util.*;

public class maxSubArraySum {
    public static void maxSubArrays(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println("\nCurrent Sum : " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("********************************");
        maxSubArrays(arr);
        sc.close();
    }
}

// Time Complexity : O(n^3)