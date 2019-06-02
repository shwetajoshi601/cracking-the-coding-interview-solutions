import java.util.*;

public class PalindromePermutation {

    public static boolean isPalindromePermutation(String s) {
        int arr[] = new int[128]; // considering ASCII 128 characters
        // construct a hash table for the count of characters
        for(int c=0; c< s.length(); c++) {
            // words or phrases, so spaces do not hold importance
            if(s.charAt(c) != ' ') {
                // increment the count at that index (index = ascii value)
                arr[(int)s.charAt(c)]++;
            }
        }
        int oddCount = 0, eventCount = 0;
        // count how many characters occur odd number of times and even number of times
        for(int i=0;i<128;i++) {
            if(arr[i] % 2 == 0) eventCount++;
            else oddCount++;
            // a string will be a palindrom only if the odd times occurring elements are 0 or 1.
            if(oddCount > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        boolean result = isPalindromePermutation(s.toLowerCase());
        if(result) System.out.println("The string is a permutation of a palindrome");
        else System.out.println("The string is not a permutation of a palindrome");
    }
}