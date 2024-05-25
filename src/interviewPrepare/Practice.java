package interviewPrepare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(6,2,5,5,34,12,12,67);
		
//		List<Integer> zero = list.stream().filter(e -> e<1).collect(Collectors.toList());
//		
//		List<Integer> coll = list.stream().filter(e -> e>=1).collect(Collectors.toCollection(() -> zero));
//		System.out.println(coll);
		
		list.stream().sorted().distinct().forEach(System.out::println);
	}

}
