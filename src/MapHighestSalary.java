import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapHighestSalary {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();

		map1.put("raj", 1500);
		map1.put("tom", 1200);
		map1.put("gary", 1700);
		map1.put("vimal", 1400);
		map1.put("arun", 1250);
		
		
		
		map1.entrySet().stream()
		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.collect(Collectors.toList())
		.get(0);
		
		
		
		
		
		
		
		
		
		
		Entry<String, Integer> myResult = map1.entrySet().stream()
		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.collect(Collectors.toList())
		.get(0);
		
		//System.out.println(myResult);
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Integer> collect = map1.entrySet().stream()
//		.sorted(Map.Entry.comparingByValue())
//		.collect(Collectors.mapping(Map.Entry::getValue, Collectors.toList()));
		
		Entry<String, Integer> mapResult = map1.entrySet().stream()
		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.collect(Collectors.toList()).get(0);
		
//	Map<String, Integer> sim = 	map1.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		
		//System.out.println(sim);

		
//		Optional<Entry<String, Integer>> mapOne = map1.entrySet()
//		.stream()
//		.collect(Collectors.maxBy(Map.Entry.comparingByValue()));
		

		//System.out.println(collect);
		

		
		
		
		
		
		
		
		

		Map<String, Integer> map2 = new HashMap<>();

		map2.put("raj", 1500);
		map2.put("tom", 1200);
		map2.put("gary", 1700);
		map2.put("vimal", 1400);
		map2.put("arun", 1250);
		map2.put("vinay", 1700);
		map2.put("venkat", 1400);
		map2.put("sam", 1250);
		
		
		
		Map<Integer, List<String>> myCollect = map2.entrySet().stream()
		.collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		
		Entry<Integer, List<String>> entry1 = myCollect.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(0);
		
		//System.out.println(entry1);
		
		
		
		
		
		
		
		
		
		

//		Entry<Integer, List<String>> result = map2.entrySet().stream()
//				.collect(Collectors.groupingBy(Map.Entry::getValue,
//						Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
//				.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
//				.collect(Collectors.toList()).get(0);
		
		Entry<Integer, List<String>> result = entry1;
		

		//System.out.println(result);
		
		

	}

}
