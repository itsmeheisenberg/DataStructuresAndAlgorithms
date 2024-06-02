package Strings;

/*Lexicographically */
public class LargestString {
    public static void main(String args[]) {
        String[] fruits = { "Apple", "mango", "banana", "watermelon", "Orange", "pineapple" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
/*
 * str1.compareTo(str2)
 * 0 : equal
 * -ve: str1<str2
 * +ve: str1>str2
 * str1.compareToIgnoreCase(str2)
 */