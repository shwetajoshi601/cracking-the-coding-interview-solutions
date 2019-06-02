import java.util.*;

public class URLify {

    /**
     *  A simple solution using the string builder in Java
     */
public static String URLifyString(String s, int len) {
    // To hold the URLified string
    StringBuilder sb = new StringBuilder();

    for(int i=0; i<len; i++) {
        // if the character is space, append %20
        if((int)s.charAt(i) == 32) {
            sb.append("%20");
            continue;
        }
        // else append the character as it is
        sb.append(s.charAt(i));
    }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        // additional spaces may be given in the end to hold the new characters.
        // To find the true length, remove these additional spaces
        s = s.trim(); 
        int trueLength = s.length();
        String url = URLifyString(s, trueLength);
        System.out.println("The URLified string is: " + url);
    }
}