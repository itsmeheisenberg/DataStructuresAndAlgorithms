package Arrays;
import java.util.Scanner;

public class removeDuplicates {

    public static int remove(int arr[], int size) {
        if (size == 0 || size == 1)
            return size;

        int j = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[size - 1];
        return j;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        size = remove(arr, size);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
/* Array is Sorted (given in the problem) */
/* Time Complexity : O(n) */
/* Space Complexity : O(1) */
/*
public int removeD(int arr[]) {
    int j = 0;
    for(int i=0;i<arr.length;i++) {
        if(arr[j]!=arr[i]) {
            arr[++j]=arr[i];
        }
    }
    return ++j;  //returns size of array which has no duplicate
}
 */