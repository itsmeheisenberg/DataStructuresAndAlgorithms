package Arrays;

public class BinarySearch {
    public static int binarySearch(int[] numbers, int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (numbers[mid] == key)
                return mid;

            if (numbers[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 9, 12, 15, 25 };
        int key = 25;
        System.out.println("Index for key is : " + binarySearch(numbers, key));
    }

}

// Time Complexity : O(log n)
