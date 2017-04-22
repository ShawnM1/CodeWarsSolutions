import java.util.ArrayList;

class Persist {
	public static int persistence(long n) {
		if (n / 10 < 1) {
			return 0;
		} else {
			int counter = 0;
			do {
				String num = String.valueOf(n);
				ArrayList<Integer> digitList = new ArrayList<Integer>();
				for (int i = 0; i < num.length(); i++) {
					digitList.add(Character.getNumericValue(num.charAt(i)));
				}
				n = 1;
				for (Integer digit : digitList) {
					n *= digit;
				}
				counter++;
			} while ((n / 10) >= 1);
			return counter;
		}
	}
}