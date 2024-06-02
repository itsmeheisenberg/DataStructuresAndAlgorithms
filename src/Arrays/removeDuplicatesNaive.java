/*Naive Approach */
package Arrays;
public class removeDuplicatesNaive {

    public static int remove(int arr[], int size) {
        if (size == 0 || size == 1)
            return size;

        int temp[] = new int[size];
        int j = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[size - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 6 };
        int size = arr.length;
        size = remove(arr, size);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/* Array is Sorted (given in the problem) */
/*Time Complexity : O(n) */
/*Space Complexity : O(n) */