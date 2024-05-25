import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String input = "Hi lets start this small interview lets start";
		
		
		
		//Find duplicate words in a string
		String[] splitIt = input.split(" ");
		
		Map<String, Long> collectIt = Arrays.stream(splitIt)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		//collectIt.entrySet().stream().filter(e -> e.getValue()> 1).map(e-> e.getKey()).forEach(System.out::println);
		
		
		
		//Sum the values present in string
		
		String stringSum = "Item1 20 Item2 30 item3 25 item4 25";
		
		String[] split1 = stringSum.split(" ");
		
		OptionalDouble sumInString = Arrays.stream(split1).filter(e -> e.matches("\\d+")).mapToInt(Integer::valueOf).average();
	//	System.out.println("sumInString: " + sumInString);
		
		
		
		
		
		/****** Average the values present in string ******/// Doubt
		
		String[] split2 = {"1-english:45, 2-maths:20"};
		
		OptionalDouble averageString = Arrays.stream(split2).filter(e -> e.matches("\\d+")).mapToInt(Integer::valueOf).average();
	//	System.out.println("averageString: " + averageString);
		
		
		
		
		
		//Reverse the string
		
		String reversedString = "";
		
		char ch;
		
		for(int i =0; i<input.length(); i++) {
			
			ch = input.charAt(i);
			reversedString = ch + reversedString;
			
		}
		System.out.println("rev : " + reversedString);
		
		//java 8 reverse string
		String rev8 = input.chars().mapToObj(e -> String.valueOf((char)e)).reduce((a,b) -> b+a).orElse("");
		
		System.out.println(rev8);
		
		
		
		//Print words count in a string 
		
        String[] splitWord = splitIt;
		
		Stream<String> streamWord = Arrays.stream(splitWord);
		
		LinkedHashMap<String, Long> collectWord = streamWord
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		//collectWord.forEach((k,v) -> System.out.println(k +" "+v));
		
		
		
		
		//Print character count in a string
		
		LinkedHashMap<Character, Long> countChar = input.toLowerCase().chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		
		
		
		//String Joiner
		
		String name = "Hello this is a string";
		
		String[] split = name.split(" ");
		
		StringJoiner sb = new StringJoiner("-", "[", "]");
		
		for(String s1 : split) {
			sb.add(s1);
		}
		//System.out.println(sb.toString());
		
		
		
		
		//No. of vowels in a string
		
		long count = name.chars().mapToObj(x -> (char)x).filter(x -> {
			return (x=='a' || x=='e' || x=='i' || x=='o' || x=='u');
		}).count();
		
		//System.out.println(count);
		
		
		
		//find duplicates in a string
		
		Map<Character, Long> collectDuplicates = name.toLowerCase().chars().mapToObj(x -> (char)x)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		Character character = collectDuplicates.entrySet().stream().filter(e -> e.getValue()>1).map(e -> e.getKey()).findFirst().get();
		
		//System.out.println(collectDuplicates);
		
		//System.out.println(character);
		
		
		
		
		
		
		
		
	}

}
