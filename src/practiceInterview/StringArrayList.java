package practiceInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringArrayList {

	public static void main(String[] args) {
		
        String[] fruit1 = {"apple", "pineapple", "banana", "papaya", "apple", "fru", "banana"};
		
		String[] fruit2 = {"apple", "grape", "banana", "orange"};
		
		
		
		
		
		
		

		//Find length of the longest string in an array
		
		String longestString = Arrays.stream(fruit1)
		.reduce((a,b) -> a.length() > b.length() ? a : b)
		.get();
		
		System.out.println("longestString : " + longestString);
		
		
		
		//Merge two string array and get common elements
		
		Arrays.asList(fruit1).stream().filter(Arrays.asList(fruit2)::contains).distinct().forEach(System.out::println);
		
		
		
		//From an string array get elements starts from 'a'
		
		List<String> startWithA = Arrays.stream(fruit1).filter(e -> e.startsWith("a")).collect(Collectors.toList());
		System.out.println(startWithA);
		
		
				
		//Find duplicate elements in a string array
		
		Set<String> set = new HashSet<>();
		
		Arrays.stream(fruit1).filter(e -> !set.add(e)).forEach(System.out::println);
		
		
		
		//Can we reuse streams in Java
		
		
		
		
		
		
	}

}
