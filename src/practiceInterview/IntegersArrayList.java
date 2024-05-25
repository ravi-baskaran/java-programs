package practiceInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegersArrayList {

	public static void main(String[] args) {
		
		/***************** INTEGER Array List<>*******************/
		
		
		List<Integer> num1 = Arrays.asList(1,3,5,8,3,9,12,15,2,3,5,9);
		
		List<Integer> num2 = Arrays.asList(16,15,6,18,13,11,12,7,15);
		
		
		
		
	
		//System.out.println(ans1);
		
		
		
		
	
		
		
		
		

		// Nth highest number in list
		Optional<Integer> n = num1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("2nd :" + n.get());

		// Find duplicates in list and count duplicated
		Set<Integer> set = new HashSet<>();
		Map<Integer, Long> collectCou = num1.stream().filter(e -> !set.add(e))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("collectCou :" + collectCou);

		// Find number starts with 1
		num1.stream().filter(e -> e.toString().startsWith("1")).forEach(System.out::println);

		// Find max and min number in list
		Optional<Integer> max = num1.stream().max(Integer::compare);
		System.out.println("max is : " + max.get());

		Optional<Integer> min = num1.stream().min(Integer::compare);
		System.out.println("min is : " + min.get());

		// sort list in ascending and descending order
		num1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		num1.stream().sorted().forEach(System.out::println);

		// List of string to upperCase and LowerCase
		List<String> name = Arrays.asList("aa", "ab", "cc", "tt");
		name.stream().map(e -> e.toUpperCase()).forEach(System.out::println);

		// sum of multiple list
		List<Integer> list1 = Arrays.asList(2, 4, 6, 8, 8);
		List<Integer> list2 = Arrays.asList(6, 8, 9);
		List<Integer> list3 = Arrays.asList(2, 4, 6, 8, 8, 6, 12);

		List<List<Integer>> totalList = Arrays.asList(list1, list2, list3);

		Optional<Integer> totalSum = totalList.stream().flatMap(e -> e.stream()).reduce(Integer::sum);
		
		System.out.println(totalSum.get());
		

		
		//Find Common elements in two list
		
		num1.stream().filter(num2::contains).forEach(System.out::println);
		
		
		
		
		
		//Print odd numbers on left and even numbers on right
		
		List<Integer> even = num1.stream().filter(e -> e%2 == 0).collect(Collectors.toList());
		List<Integer> odd =num1.stream().filter(e -> e%2 != 0).collect(Collectors.toCollection(() -> even ));
		
		System.out.println("even and odd " + odd);
		
		
		//Print negative number in left and positive number on right
		
		
		
		
		/***************** ARRAY of int[] *****************/
		
		
	    int[] array1 = {1,2,5,4,7,8,12,4,15,11};
		
		int[] array2 = {12,15,19,17,9,14,4,7};
		
		
		
		
		//Second highest number in array
		
		Integer secondHighestNum = Arrays.stream(array1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println("secondHighestNum :" + secondHighestNum);
		
		//Find element starts with 1
		
		List<String> startsWith1 = Arrays.stream(array1).boxed().map(e -> e+"").filter(e -> e.startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println("startsWith1 :" + startsWith1);
		
		
		
		//Find common elements in two arrays
	    
		
       Integer[] arrays1 = {1,2,5,4,7,8,12,4,15,11};  //(convert to Integer[])
		
       Integer[] arrays2 = {12,15,19,17,9,14,4,7};
       
       Arrays.asList(arrays1).stream().filter(Arrays.asList(arrays2)::contains).distinct().forEach(System.out::println);
		
		
		
		//Reverse an Array
		
		
       int start = array1[0];
		int end = array1.length-1;
		
		for(int i =0; i<=end; i++) {
			int temp=array1[i];
			array1[i]= array1[end];
			array1[end] = temp;
			start++;
			end--;
		}
		
		System.out.println("reverse : " +Arrays.toString(array1));
	
		
		
		
		//Merge Two arrays of integer
		
				int [] numsArr1 = {1,3,4,6,3,6,1,8,9};
				
				int [] numsArr2 = {1,12,4,16,8,19};
				
				
//				int high = Integer.MIN_VALUE;
//				int secHigh = Integer.MIN_VALUE;
//				
//				for(int i =0; i< numsArr1.length; i++) {
//					
//					if(numsArr1[i] > high) {
//						secHigh=high;
//						high=numsArr1[i];
//					}
//					
//					if(numsArr1[i] <high && numsArr1[i] <secHigh) {
//						secHigh=numsArr1[i];
//					}
//				}System.out.println(secHigh);
				
				
				
			List<Integer> collect1 = Arrays.stream(numsArr1).boxed().collect(Collectors.toList());
			List<Integer> collect2 = Arrays.stream(numsArr2).boxed().collect(Collectors.toList());
			
			List<Integer> collectT = collect1.stream().filter(collect2::contains).distinct().collect(Collectors.toList());
			
			System.out.println("common e " + collectT);
				
			//List<Integer> i =	Collections.sort(Arrays.asList(numsArr1));
				
				Integer[] numI = {1,3,4,6,3,6,1,8,9};
				Integer[] numI2 = {1,12,4,16,8,19};
				
			
				
				
				
				//Sort using Collections
				List<Integer> nu = Arrays.asList(numI);
				
				Collections.sort(nu, Comparator.reverseOrder());
				System.out.println("nu sort :" + nu);
				
				
				IntStream arr1 = Arrays.stream(numsArr1);
				IntStream arr2 = Arrays.stream(numsArr2);
				
				
			
			int[] res =	IntStream.concat(arr1, arr2).sorted().distinct().toArray();

			System.out.println("arr res :" + Arrays.toString(res));
		
		
		
		
		

	}

}
