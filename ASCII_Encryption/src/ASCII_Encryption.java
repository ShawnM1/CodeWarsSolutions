
public class ASCII_Encryption {
	  public static String encrypt(String text, int rule) {
			StringBuilder ciphertext = new StringBuilder();
			char[] textArray = text.toCharArray();
			for (char ch : textArray) {
				int ascii = (((int) ch) + rule) % 256;
				ciphertext.append(Character.toString((char) ascii));
			}
			
			return ciphertext.toString();
			
	  }

}
