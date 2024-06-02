package Arrays;
import java.util.Scanner;
public class checkSorted {

    public static boolean checkForSorted(int arr[], int size) {
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
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
        boolean result = checkForSorted(arr, size);
        System.out.println(result);
        sc.close();
    }
}
/*
 * for(int i =1;i<size;i++)
 * {
 * if(arr[i]>= arr[i-1])
 * {
 * 
 * }
 * else
 * {
 * return false;
 * }
 * }
 * return true;
 */