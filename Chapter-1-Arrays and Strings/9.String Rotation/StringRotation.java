import java.util.*;

public class StringRotation {
    /**
     * Checks if two strings are rotations of each other
     */
    public static boolean isRotation(String s1, String s2) {
        // if string lengths are different
        if(s1.length() != s2.length() || s1.length() == 0) return false;
        // concatenate s1 with itself
        String str = s1 + s1;
        // check if s2 is a substring
        if(isSubstring(str, s2)) return true;
        return false;
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