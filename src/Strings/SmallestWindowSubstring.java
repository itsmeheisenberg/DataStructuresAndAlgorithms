package Strings;

public class SmallestWindowSubstring {

    public static String findSubstring(String string, String pattern) {
        // Array to store character frequencies of pattern and current substring
        int[] patternFreq = new int[256];
        int[] stringFreq = new int[256];

        int matched = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;

        // Calculate character frequencies for pattern
        for (char ch : pattern.toCharArray()) {
            patternFreq[ch]++;
        }

        // Iterate over the string
        for (int end = 0; end < string.length(); end++) {
            char ch = string.charAt(end);
            stringFreq[ch]++;

            // If the current character is present in pattern and its frequency in substring
            // is less than or equal to pattern
            if (patternFreq[ch] > 0 && stringFreq[ch] <= patternFreq[ch]) {
                matched++;
            }

            // If all characters of pattern are found in current substring
            if (matched == pattern.length()) {
                // Try to minimize the substring length by moving start index forward
                while (patternFreq[string.charAt(start)] == 0
                        || stringFreq[string.charAt(start)] > patternFreq[string.charAt(start)]) {
                    if (patternFreq[string.charAt(start)] == 0
                            || stringFreq[string.charAt(start)] > patternFreq[string.charAt(start)]) {
                        stringFreq[string.charAt(start)]--;
                    }
                    start++;
                }

                // Update the minimum length and start index of the smallest substring
                int length = end - start + 1;
                if (length < minLength) {
                    minLength = length;
                    startIndex = start;
                }
            }
        }

        if (startIndex == -1) {
            return "N/A";
        }

        return string.substring(startIndex, startIndex + minLength);
    }

    public static void main(String[] args) {
        String string1 = "this is a test string";
        String pattern1 = "tist";
        System.out.println("Output 1: " + findSubstring(string1, pattern1));

        String string2 = "ABC";
        String pattern2 = "D";
        System.out.println("Output 2: " + findSubstring(string2, pattern2));
    }
}
