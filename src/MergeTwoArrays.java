import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrays {
	
	public static void main(String[] args) {
		
		//Two arrays of string
		
		String[] fruit1 = {"apple", "mango", "banana", "papaya", "apple", "mango", "banana"};
		
		String[] fruit2 = {"apple", "pineapple", "banana", "orange"};
		

		
		//Merge two string array and get common elements
		
		//From an string array get elements starts from 'a'
		
		//Find duplicate elements in a string array
//		Stream<Integer> streamFr = Arrays.stream(numsArr1);
//		Set<Integer>s = new HashSet<>();
//		streamFr.filter(e -> !s.add(e)).forEach(System.out::println);
		
		
		
		List<Integer> nums1 = Arrays.asList(2,4,5,6,3,6,9,8);
		List<Integer> nums2 = Arrays.asList(12,4,15,6,13,6,19,8);
		
	
		
		
		//Merge two Integer array and get common elements
		
		
		
		//Print odd numbers on left and even numbers on right
		
		List<Integer> collectOdd = nums1.stream().filter(e -> e%2 !=0).collect(Collectors.toList());
		
		List<Integer> collectTotal = nums1.stream().filter(e -> e%2==0).collect(Collectors.toCollection(() -> collectOdd));
		
		System.out.println("OddAfterEven: " + collectTotal);
		
		
		
		
		//Print negative number in left and positive number on right
		
		List<Integer> numsPositiveAndNegative = Arrays.asList(2,4,-5,6,3,-6,9,-8);
		
		List<Integer> collectNegative = numsPositiveAndNegative.stream().filter(e -> e<0).collect(Collectors.toList());
		
		List<Integer> collectBoth = numsPositiveAndNegative.stream().filter(e -> e>0).collect(Collectors.toCollection(() -> collectNegative));
		
		System.out.println("collectBoth: "+ collectBoth);
		
		
		
		
		//Can we reuse streams in Java
		
		
		Stream<Integer> n1 = nums1.stream();
		Stream<Integer> n2 = nums2.stream();
		
		//Stream.concat(n1, n2).distinct().sorted().filter(e -> e%2==0).map(e -> e*2).forEach(System.out::println);
		
		Map<Integer, Long> collectNum = Stream.concat(n1, n2).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		//collectNum.entrySet().stream().filter(e -> e.getValue()>1).map(e -> e.getKey()).forEach(System.out::println);
		
		
		Stream<String> f1 = Arrays.stream(fruit1);
		Stream<String> f2 = Arrays.stream(fruit2);
		
		//Stream.concat(f1, f2).distinct().forEach(System.out::println);
		
		
		
		
		
		//Can we reuse streams in java
		
		Supplier<Stream<String>> reuse = () -> Stream.of(fruit1);
		
		//reuse.get().forEach(System.out::println);
		
		long count = reuse.get().filter(x -> x.equals("apple")).count();
		//System.out.println(count);
		
		
		
		
		
		
		
		
		//Merge Two arrays of integer
		
		int [] numsArr1 = {1,3,4,6,3,6,1,8,9};
		
		int [] numsArr2 = {1,12,4,16,8,19};
		
		
		//reverse int arrey
		
		int[] revArr = IntStream.rangeClosed(1, numsArr1.length)
		.map(e -> numsArr1[numsArr1.length - e]).toArray();
		
		System.out.println(Arrays.toString(revArr));
		
		
		
		
		IntStream arr1 = Arrays.stream(numsArr1);
		IntStream arr2 = Arrays.stream(numsArr2);
		
	
	int[] res =	IntStream.concat(arr1, arr2).sorted().distinct().toArray();

	System.out.println("arr res :" + Arrays.toString(res));
		
		
		
		
		//multiply array by itself
		
//		List<Integer> num = Arrays.asList(nums1);
//		
//		Optional<Integer> multi = num.stream().reduce((a,b) -> a*b);
//		
//		if(multi.isPresent()) {
//			System.out.println(multi);        
//		}else {
//			System.out.println("no value present");
//		}
		
		
		
		
		
			
		
		
	}

}
