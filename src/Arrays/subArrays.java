package Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class subArrays {
    public static void printSubarrays(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays : " + ts);
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
            System.out.println("Sub Arrays ");
            printSubarrays(arr);
        } catch (InputMismatchException e) {
            System.out.println("Exception Caught..Wrong input value.");

        }
    }
}
