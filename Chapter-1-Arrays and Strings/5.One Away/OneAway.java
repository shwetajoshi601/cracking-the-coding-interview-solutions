import java.util.*;

public class OneAway {
    public static boolean isOneAway(String s1, String s2) {
        // if the difference in length is more than 1, they are definitely not one edit away
        int diff = s1.length() - s2.length();
        if(diff > 1 || diff < -1) return false;

        // take index as the length of the larger string
        int index = diff > 0 ? s1.length() : s2.length();
        // i -> s1, j -> s2, miss -> number of edits
        int i=0,j=0,miss=0;

        // iterate as many times as the larger string
        while(i<index) {
            // if one of the strings has ended, no need to check further
            if(i == index-1 || j == index-1) break;
            // compare corresponding characters in s1 and s2
            if(s1.charAt(i) != s2.charAt(j)) {
                // if not equal its an edit to be made
                miss++;
                // increment only s1 pointer if its length is greater
                if(s1.length() > s2.length()) i++;
                // increment only s2 pointer if its length is greater
                else if(s1.length() < s2.length()) j++;
                // increment both if equal length strings
                else {
                    i++;
                    j++;
                }
            } else {
                // if characters match, move ahead
                i++;
                j++;
            }
            // at any point if edits > 1, return
            if(miss > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2: ");
        String s2 = sc.nextLine();
        boolean result = isOneAway(s1,s2);
        if(result) System.out.println("The strings are one/zero edit away");
        else System.out.println("The strings are not one/zero edit away");
    }
}