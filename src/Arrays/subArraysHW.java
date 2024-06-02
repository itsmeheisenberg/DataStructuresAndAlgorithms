package Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class subArraysHW {
    public static void printSubarrays(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                System.out.println("\nSum : " + sum);
                sum = 0;
                System.out.println("*************");
            }
        }
    }

    public static void main(String args[]) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array : ");
            n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter array elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Sub Arrays: ");
            printSubarrays(arr);
        } catch (InputMismatchException e) {
            System.out.println("Exception Caught..Wrong input value.");

        }
    }

}
