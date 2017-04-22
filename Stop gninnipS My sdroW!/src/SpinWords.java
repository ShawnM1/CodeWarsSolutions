import java.util.Stack;

public class SpinWords {

	public static void main(String[] args) {
		System.out.println(spinWords("Hey fellow warriors"));

	}
	/** 
	 * Method to return a sentence with all words in length >= 5 reversed.
	 * @param sentence
	 * @return String
	 */
	public static String spinWords(String sentence) {
		StringBuilder newSentence = new StringBuilder();
		String[] words = sentence.split(" ");
		for (String word : words) {
			if (word.length() >= 5) {
				newSentence.append(reverseWord(word) + " ");
			} else {
				newSentence.append(word + " ");
			}
		}
		return newSentence.toString().trim();

	}
	
	private static String reverseWord(String word) {
		StringBuilder reversedWord = new StringBuilder();
		Stack<Character> reverseStack = new Stack<Character>();
		char[] letters = word.toCharArray();
		for (char c : letters) {
			reverseStack.push(c);
		}
		while (!reverseStack.isEmpty()) {
			reversedWord.append(reverseStack.pop());
		}
		return reversedWord.toString();
	}

}
