package practiceInterview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StupidTask {

	public static void main(String[] args) {
		
		//Find Given 2 strings or Anagrams or not 
		
		String str1 = "Teacher";
		String str2 = "Cheater";
		
		str1 = Stream.of(str1.split("")).map(e -> e.toLowerCase()).sorted().collect(Collectors.joining());
		
		str2 = Stream.of(str2.split("")).map(e -> e.toLowerCase()).sorted().collect(Collectors.joining());
		
		if(str1.equals(str2)) {
			System.out.println("Its anagrams");
		}else {
			System.out.println("not anagrams");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
