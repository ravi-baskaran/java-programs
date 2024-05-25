import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingCharactersInString {

	public static void main(String[] args) {
		
		
		//Find Repeating and non Repeating characters in a String
		String name = "Hi lets start this small interview ravi";
		
		LinkedHashMap<Character, Long> count = name.replaceAll("\\s+", "").toLowerCase().chars().mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		Character firstRepeat = count.entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).findFirst().get();
		
		Character nonRepeate = count.entrySet().stream().filter(x -> x.getValue()==1).map(x -> x.getKey()).findFirst().get();
		
		System.out.println(count);
		
		System.out.println(nonRepeate);
		
		
		/*************************************************/
		
		
		//Find Repeating and non Repeating words in a String
		
		String name1 = "Hi lets start this small interview ravi lets start";
		
		
		String[] split1 = name1.split(" ");
		
		LinkedHashMap<String, Long> collectWords = Arrays.stream(split1)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		Optional<String> findFirstRepated = collectWords.entrySet().stream()
				.filter(e -> e.getValue()>1).map(e -> e.getKey()).findFirst();
		
		Optional<String> findFirstNonRepated = collectWords.entrySet().stream()
				.filter(e -> e.getValue()==1).map(e -> e.getKey()).findFirst();
		
		System.out.println(collectWords);
		
		System.out.println(findFirstNonRepated.get());
		

	}

}
