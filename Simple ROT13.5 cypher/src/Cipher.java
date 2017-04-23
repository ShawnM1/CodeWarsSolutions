public class Cipher {
	private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	private static final String UPPERCASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String NUMBERS = "0123456789";

	public static void main(String[] args) {
		System.out
				.println(ROT135("The quick brown fox jumps over the 2 lazy dogs"));
	}

	public static String ROT135(String input) {
		StringBuilder ciphertext = new StringBuilder();
		char[] inputChars = input.toCharArray();
		for (char c : inputChars) {
			if (Character.isDigit(c)) {
				int index = NUMBERS.indexOf(c);
				ciphertext.append(NUMBERS.charAt((index + 5) % 10));
			} else if (Character.isAlphabetic(c) && Character.isUpperCase(c)) {
				int index = UPPERCASE_ALPHABET.indexOf(c);
				ciphertext.append(UPPERCASE_ALPHABET.charAt((index + 13) % 26));
			} else if (Character.isAlphabetic(c) && Character.isLowerCase(c)) {
				int index = LOWERCASE_ALPHABET.indexOf(c);
				ciphertext.append(LOWERCASE_ALPHABET.charAt((index + 13) % 26));
			} else {
				ciphertext.append(c);
			}
		}
		return ciphertext.toString();
	}

}
