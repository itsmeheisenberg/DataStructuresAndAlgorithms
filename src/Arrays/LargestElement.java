package Arrays;
public class LargestElement {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 9, 10, 14, 5, 2 };
        System.out.println("Largest value is : " + getLargest(numbers));
    }

}