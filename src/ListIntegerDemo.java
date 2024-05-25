import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListIntegerDemo {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,3,5,8,9,12,15,2,3,5,9);
		
		int[] arr = {1,12,4,61,7,7};
		
		//find 2nd greatest element
		for(int i =0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[j] > arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
				}
			}
		}System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.stream(arr).skip(1).findFirst());
		
		
//		for(int i =arr.length-1; i>=0; i--) {
//			System.out.print(arr[i] + " ");
//		}
//		
		
		
		Collections.reverse(num);
		System.out.println("rv :" + num);
		
	
		//Nth highest number in list
		Optional<Integer> n = num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    	System.out.println("2nd :" + n.get());
    	
		
		//Find duplicates in list
		Set<Integer> set = new HashSet<>();
		num.stream().filter(e -> !set.add(e)).forEach(System.out::println);
		
		
		//Find number starts with 1
		num.stream().map(e -> e+"").filter(e -> e.startsWith("1")).forEach(System.out::println);
		
		
		//Find max and min number in list
		Optional<Integer> max = num.stream().max(Integer::compare);
		System.out.println("max is : "+ max.get());
		
//		num.stream().reduce(Integer::max);
//		num.stream().reduce(Integer::min);
		
		Optional<Integer> min = num.stream().min(Integer::compare);
		System.out.println("min is : "+ min.get());
		
		
		
		//sort list in ascending and descending order
		num.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		num.stream().sorted().forEach(System.out::println);
		
		
		
		//List of string to upperCase and LowerCase
		List<String> name = Arrays.asList("aa", "ab", "cc", "tt");
		name.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		
		
		
		//sum of multiple list
		List<Integer> list1 = Arrays.asList(2,4,6,8,8);
		List<Integer> list2 = Arrays.asList(6,8,9);
		List<Integer> list3 = Arrays.asList(2,4,6,8,8,6,12);
		
		List<List<Integer>> totalList = Arrays.asList(list1, list2, list3);
		
		Optional<Integer> totalSum = totalList.stream().flatMap(e -> e.stream()).reduce(Integer::sum);
		System.out.println(totalSum.get());
		
		Integer s = totalList.stream().flatMap(e -> e.stream()).collect(Collectors.summingInt(Integer::intValue));
	    System.out.println(s);
	    
	    
	    
		
		
		
		
		
		
		
		//List<Integer> num = new ArrayList<>();
		
		Optional<Integer> reduce = reduceMet(num);
		
		if (reduce.isPresent()) {
			System.out.println(reduce.get());
		}else {
			System.out.println("no value");
		}

	}

	private static Optional<Integer> reduceMet(List<Integer> num) {
		return num.stream()
		.reduce((a,b) -> a>b ? a:b);
	}

}
