
import java.util.HashMap;
import java.util.Map;
public class Scramblies {
    
   public static boolean scramble(String str1, String str2) {
		
		
		HashMap<Character, Integer> str1Map = new HashMap<Character, Integer>();
		for (int i = 0; i < str1.length(); i++) {
			
			char currentChar = str1.charAt(i);
			//System.out.println(currentChar);
			if (str1Map.containsKey(currentChar)) {
				int value = str1Map.get(currentChar);
				value++;
				str1Map.put(currentChar, value);

			} else {
				str1Map.put(currentChar, 1);
			}
		}
		HashMap<Character, Integer> str2Map = new HashMap<Character, Integer>();
		for (int i = 0; i < str2.length(); i++) {
			char currentChar = str2.charAt(i);
			if (str2Map.containsKey(currentChar)) {
				int value = str2Map.get(currentChar);
				value++;
				
				str2Map.put(currentChar, value);

			} else {
				str2Map.put(currentChar, 1);
			}
		}
		char[] str2Array = str2.toCharArray();
		
		for (char c : str2Array) {
			if (str1.indexOf(c) == -1) {
				return false;
			}
			if (str1Map.get(c) < str2Map.get(c)) {
				return false;
			}
		}
		return true;
		
	}
}