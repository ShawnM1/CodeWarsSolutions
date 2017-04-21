

public class LuckyTicket {
	public static void main(String[] args) {
		System.out.println(numberOfTickets(100000,999999));
	}
	public static int numberOfTickets(int from, int to) {
		int numOfLuckyTickets = 0;
		for (int i = from; i < to + 1; i++) {
			String currentString = String.valueOf(i);
			char[] lastThreeChars = currentString.substring(
					currentString.length() - 3, currentString.length())
					.toCharArray();
			char[] firstThreeChars = currentString.substring(0, 3)
					.toCharArray();
			int sumFirst = 0;
			int sumLast = 0;

			for (char c : lastThreeChars) {
				sumLast += Character.getNumericValue(c);
			}
			for (char c : firstThreeChars) {
				sumFirst += Character.getNumericValue(c);
			}

			if (sumFirst == sumLast) {
				numOfLuckyTickets++;
			}

		}
		return numOfLuckyTickets;
	}
}
