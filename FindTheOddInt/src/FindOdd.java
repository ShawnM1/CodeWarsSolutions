import java.util.Map.Entry;

import java.util.HashMap;

public class FindOdd {
	public static int findIt(int[] A) {
		if (A.length == 0 || A == null) {
			return 0;
		}
		HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		int odd = 0;
		for (int n : A) {
			if (numMap.containsKey(n)) {
				int timesInArray = numMap.get(n) + 1;
				numMap.put(n, timesInArray);
			} else {
				numMap.put(n, 1);
			}
		}
		for (Entry<Integer, Integer> m : numMap.entrySet()) {
			if (m.getValue() % 2 != 0) {

				odd = m.getKey();

			}
		}

		return odd;
	}
}