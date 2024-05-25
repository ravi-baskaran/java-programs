package practiceInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOnly {

	public static void main(String[] args) {
	
        String input = "Hi lets start this small interview lets start";
        
        
        //count occurrence in string
        
      String[] arr =  input.replaceAll("\\s", "").split("");
      
      Map<String, Integer> map = new LinkedHashMap<>();
      
      for(String s :arr) {
    	  if(map.containsKey(s)) {
    		  map.put(s, map.get(s)+1);
    	  }else {
    		  map.put(s, 1);
    	  }
      }System.out.println("map: " + map);
        
        
        
        
        
        
      
        
		
        
		//Count the no.of occurance in a string
        Set<String> set1 = new HashSet<>();
       List<String> collect = Arrays.stream(input.split("")).filter(e -> !set1.add(e)).distinct().collect(Collectors.toList());
        
        System.out.println("collect " + collect);
        
       Map<Character,Long> coI =  input.toLowerCase().replaceAll("\\s", "").chars().mapToObj(e-> (char)e)
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
       
       System.out.println("No.of occur: " +coI);
        
       
		
		//Find duplicate words in a string
        
       Map<Character,Long> count1 =  input.toLowerCase().replaceAll("\\s", "").chars().mapToObj(e-> (char)e)
    	        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
       
       Character character1 = count1.entrySet().stream().filter(e -> e.getValue()==1).map(e -> e.getKey()).findFirst().get();
       System.out.println("char: " + character1);
       
        
      //Sum the values present in string
		
      		String stringSum = "Item1 20 Item2 30 item3 25 item4 25";
      		
      		int sumInt = Arrays.stream(stringSum.split(" ")).filter(e -> e.matches("\\d+")).mapToInt(Integer::valueOf).sum();
      		System.out.println(sumInt);
      		
     
      		
      		
      	//Reverse the string
      		
      		
      		String[] words = input.split(" ");
      		
      		List<String> s = Arrays.stream(words).map(e -> new StringBuilder(e).reverse().toString()).collect(Collectors.toList());
      		
      		System.out.println("reverse 8 " + s);
      		
      		
    		
    		String reversedString = "";
    		
    		for(int i = input.length()-1; i>=0; i--) {
    			reversedString = reversedString+input.charAt(i);
    		}
    		System.out.println("rev str : " + reversedString);
    		
    		
    		
    		
    		//Print duplicate words in a string 
    		
    		String[] splitW = input.split(" ");
    		Set<String> set = new HashSet<>();
    		Arrays.stream(splitW).filter(e -> !set.add(e)).forEach(System.out::println);
    		
    		
    		
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
    		
    		System.out.println("vowel count " + count);
    		
    		
    		
    		//find duplicates in a string
    		
    		Map<Character, Long> collectDuplicates = name.toLowerCase().chars().mapToObj(x -> (char)x)
    				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    		
    		Character character = collectDuplicates.entrySet().stream().filter(e -> e.getValue()>1).map(e -> e.getKey()).findFirst().get();
    		
    		//System.out.println(collectDuplicates);
    		
    		//System.out.println(character);
      		
      		
      		
      		
		
		

	}

}
