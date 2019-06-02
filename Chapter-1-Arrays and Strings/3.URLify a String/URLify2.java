import java.util. * ;

public class URLify2 {

/**
  *  Solution using a character array
  */
	public static String URLifyString(String s, int tLen) {
		if (s.length() == 0) return "";
		// form a character array from the string
		char[] arr = s.toCharArray();
		// point to the end of the string (last index) with extra spaces
		int k = s.length() - 1;

		try {
			// traverse the true length of the string in reverse order
			for (int i = tLen - 1; i >= 0; i--) {
				if (i != k) {
					// if the character is not a space, start filling the blank spaces at the end
					if (arr[i] != ' ') {
						arr[k] = arr[i];
						// move the pointer
						k--;
					} else {
						// character is a space
						// fill three positions with %20
						arr[k] = '0';
						arr[k - 1] = '2';
						arr[k - 2] = '%';
						// decrement by 3 since we filled 3 positions
						k = k - 3;
					}
				}
			}
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("Check if you have entered the required number of extra spaces");
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in );
		// assuming required number of extra spaces have been entered at the end
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		System.out.println("Enter the true length: ");
		// assuming true length is given
		int trueLength = sc.nextInt();
		String url = URLifyString(s, trueLength);
		System.out.println("The URLified string is: " + url);
	}
}