package Arrays;
import java.util.Scanner;

public class leftRotate {
    public static void leftRotateByD(int[] arr, int size, int d) {
        d = d % size;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shifting
        for (int i = d; i < size; i++) {
            arr[i - d] = arr[i];
        }

        // Put back temp to arr
        for (int i = size - d; i < size; i++) {
            arr[i] = temp[i - (size - d)];
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of places to rotate (D) : ");
        int d = sc.nextInt();
        leftRotateByD(arr, size, d);
        printArr(arr);
        sc.close();
    }
}
