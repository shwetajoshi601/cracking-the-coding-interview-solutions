import java.util.*;

public class StringRotation2 {
    /**
     * Checks if two strings are rotations of each other
     */
    public static boolean isRotation(String s1, String s2) {
        // if the lengths are different
        if(s1.length() != s2.length() || s1.length() == 0) return false;
        // for s1
        int i=0;
        // for s2, place at the index of the first character of original string
        // e.g.: s1=watterbottle, s2=erbottlewat. Hence, j=8 (index of w in s2)
        int j=s2.lastIndexOf(s1.charAt(0));
        // if first character of s1 not present in s2
        if(j == -1) return false;
        
        int count=0;
        // loop to compare character by character
        while(count < s1.length()) {
            count++;
            if(s2.charAt(j) == s1.charAt(i)){
                i++;
                j++;
            } else return false; // character does not match
            // if end of string s2 reached, start over from 0, since we start midway using the index of first character of s1
            if(j == s2.length()) j=0;
        }
        return true;
    }

    /**
     * Function to check if s2 is a substring of s1
     */
    public static boolean isSubstring(String s1, String s2) {
        if(s1.indexOf(s2) != -1) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String s1 = sc.nextLine().trim();
        System.out.println("Enter string 2: ");
        String s2 = sc.nextLine().trim();
        if(isRotation(s1,s2)) System.out.println(s2 + " is a rotation of " + s1);
        else System.out.println(s2 + " is not a rotation of " + s1);
    }
}