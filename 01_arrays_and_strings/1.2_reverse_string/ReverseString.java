// Solution 1: reverses a string using a character array.
public class ReverseString {
	public static void main(String[] args) {
		if(args.length == 1) {
			reverse(args[0]);
		} else {
			System.out.println("Please provide a single string to reverse.");
		}
	}

	// Prints the reverse of the given string to stdout.
	private static void reverse(String str) {
		int lenStr = str.length();
		char[] charArray = str.toCharArray();
		for(int i = 0; i < lenStr / 2; i++) {
			char earlyChar = charArray[i];
			int laterCharIndex = (lenStr - 1) - i;
			charArray[i] = charArray[laterCharIndex];
			charArray[laterCharIndex] = earlyChar;
		}
		String outputString = new String(charArray);
		System.out.println(outputString);
	}
}