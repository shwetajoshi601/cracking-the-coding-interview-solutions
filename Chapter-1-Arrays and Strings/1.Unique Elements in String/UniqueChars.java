import java.util.*;

public class UniqueChars {

    /**
     * Function to check if a string contains unique characters
     */
    static boolean containsUniqueChars(String s) {
        // There are 128 characters in character set. So, If the length is > 128, the string will not have unique characters
        if(s.length() > 128) return false;
        // You may throw a custom exception if the string is empty
        if(s.length() == 0) return false;
        
        // following the concept of hash table
        boolean charSet[] = new boolean[128];

        for(int i=0; i<s.length(); i++) {
            // the hash code is the ascii value of the character which determines its position in the hash table ((int)s.charAt(i) % 128))
            int index = (int)s.charAt(i);
            // if the value is already present
            if(charSet[index]) {
                return false;
            }
            // if the value isnt present already
            charSet[index] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("You entered: " + s);
        boolean result = containsUniqueChars(s);
        if(result)
            System.out.println("The string contains all unique characters!");
        else 
            System.out.println("The string does not contain unique characters!");
    }
    
}