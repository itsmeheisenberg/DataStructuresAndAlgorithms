
package Arrays;
public class CountSort {

    public static void countSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countSort(arr);
        System.out.println("Sorted Array");
        printArr(arr);
    }

}

/*
 * Counting Sort is a non-comparison-based sorting algorithm that works well
 * when there is limited range of input values. It is particularly efficient
 * when the range of input values is small compared to the number of elements to
 * be sorted.
 */

/*
 * Time Complexity: O(N+M), where N and M are the size of inputArray[] and
 * countArray[] respectively.
 * Worst-case: O(N+M).
 * Average-case: O(N+M).
 * Best-case: O(N+M).
 */

/* Counting sort is a stable algorithm. */

/*
 * Counting sort doesn’t work on decimal values.
 * Counting sort is inefficient if the range of values to be sorted is very
 * large.
 * Counting sort is not an In-place sorting algorithm, It uses extra space for
 * sorting the array elements
 */