import java.util.*;

public class Permutation {

    /**
     * Function to check if two strings are permutations of each other
     */
    static boolean checkPermutation(String str1, String str2) {
        // Permutation -> same number of characters
        if(str1.length() != str2.length()) return false;

        // convert to character array
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        // sort the two strings. Permutations means the strings have the same length and the same characters. Hence, sorting the strings and comparing them would validate them against the definition of permutation
        Arrays.sort(a1);
        Arrays.sort(a2);

        str1 = new String(a1);
        str2 = new String(a2);

        // compare the values
        if(str1.equals(str2)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2:");
        String str2 = sc.nextLine();

        boolean result = checkPermutation(str1, str2);
        if(result) System.out.println("The strings are permutations of each other");
        else System.out.println("The strings are not permutations of each other");
    }
}