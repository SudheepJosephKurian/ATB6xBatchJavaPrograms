package May.HW_04052024;

import java.util.Arrays;

public class HW_006 {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                System.out.println("The strings are not anagrams.");
                return;
            }
        }

        // If reached here, strings are anagrams
        System.out.println("The strings are anagrams.");
    }
}
