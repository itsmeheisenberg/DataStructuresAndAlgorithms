package Arrays;
import java.util.Scanner;

public class KadaneAlgorithm {
    public static void Kadane(int[] arr) {
        int maxSum = Integer.MIN_VALUE, currSum = 0, start = 0, end = 0, s = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (maxSum < currSum) {
                maxSum = currSum;
                start = s;
                end = i;
            }
            if (currSum < 0) {
                currSum = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum Sum : " + maxSum);
        System.out.println("Start Index : " + start);
        System.out.println("End Index : " + end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Kadane(arr);
        sc.close();
    }
}

// Time Complexity : O(n)