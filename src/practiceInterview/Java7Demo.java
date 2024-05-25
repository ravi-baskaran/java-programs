package practiceInterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Java7Demo {

	public static void main(String[] args) {

		String input = "Hi lets start this small interview lets start";

		int[] arr = { 2, 3, 2, 1, 5, 7, 7, 3, 5, 3 };

		//getCharCount(input);
		
		getIntCount(arr);

	}

	static void getCharCount(String str) {

		Map<Character, Integer> charMap = new LinkedHashMap<>();

		char[] c = str.toCharArray();

		for (char ch : c) {

			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}

		}
		System.out.println(charMap);

	}
	
	
	static void getIntCount(int[] arr) {
		
		Map<Integer, Integer> intCount = new LinkedHashMap<>();
		
		for(int i : arr) {
			
			if(intCount.containsKey(i)) {
				intCount.put(i, intCount.get(i)+1);
			}else {
				intCount.put(i, 1);
			}
			
		}System.out.println(intCount);
		
	}
	
	
	

}
