import java.util.*;

public class CompressString {

    public static String getCompressedString(String s) {
        StringBuilder sb = new StringBuilder();
        int countSeq = 0;
        // for each character
        for(int i=0; i<s.length();i++) {
            countSeq++;
            // if the next character is different, or it's the end of the string
            if(i+1 >= s.length() || s.charAt(i+1) != s.charAt(i)) {
                // add the character and count
                sb.append(s.charAt(i));
                sb.append(countSeq);
                // reset the count
                countSeq = 0;
            }
            // if the compressed string is larger than the original
            if(sb.toString().length() >= s.length()) return s;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Original String: " + s);
        s = getCompressedString(s);
        System.out.println("Compressed String: " + s);
    }
}