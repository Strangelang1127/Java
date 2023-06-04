public class isIntPalindrome {
	public static boolean isPalindrome(int x) {
		String stringInt = Integer.toString(x);
		StringBuilder stringBuilder = new StringBuilder(stringInt);
		String stringIntReversed = stringBuilder.reverse().toString();
		return stringInt.equalsIgnoreCase(stringIntReversed);
    }
}
