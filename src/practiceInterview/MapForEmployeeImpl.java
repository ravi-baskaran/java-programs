package practiceInterview;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapForEmployeeImpl {
	
	public static void main(String[] args) {
		
		Map<Employee, Integer> map = new HashMap<>();
		
		map.put(new Employee("ravi", "dev", 25, 1500, "male"), 10);
		map.put(new Employee("sara", "HR", 23, 1200, "female"), 20);
		map.put(new Employee("mani", "dev", 35, 1800, "male"),30);
		map.put(new Employee("suri", "HR", 28, 1100, "male"), 40);
		map.put(new Employee("deepa", "dev", 35, 2000, "female"), 50);
		
		
		//sort by salary and highest salary employee
		
	    Entry<Employee, Integer> entry = map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
		.collect(Collectors.toList()).get(0);
	    
	    System.out.println(entry);
	    
	    
	    
	    //Group by department
//	    map.entrySet().stream()
//	    .collect(Collectors.groupingBy(Map.Entry::getKey,
//	    		Collectors.mapping(Map.Entry<Employee::getDepartment>)));
	    
	    
	    
	    
	    Map<String, Integer> map1 = new HashMap<>();

		map1.put("raj", 1500);
		map1.put("tom", 1200);
		map1.put("gary", 1700);
		map1.put("vimal", 1400);
		map1.put("arun", 1250);
		
		
		
		Entry<String, Integer> entry2 = nthHighSalary(3, map1);
	    
		System.out.println(entry2);
	    
	    
	    
	    
		 Map<String, Integer> map2 = new HashMap<>();

			map2.put("raj", 1500);
			map2.put("tom", 1200);
			map2.put("gary", 1700);
			map2.put("vimal", 1400);
			map2.put("arun", 1250);
			map2.put("gim", 1200);
			map2.put("anil", 1700);
			map2.put("vinay", 1400);
			
			Map.Entry<Integer, List<String>> collect = map2.entrySet().stream()
			.collect(Collectors.groupingBy(Map.Entry::getValue,
					 Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
			.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
			.collect(Collectors.toList()).get(0);
			
			
			
			
			System.out.println(collect);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	    
		
		
	}

	private static Entry<String, Integer> nthHighSalary(int num, Map<String, Integer> map1) {
		return map1.entrySet().stream()
		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.collect(Collectors.toList())
		.get(num-1);
	}

}
