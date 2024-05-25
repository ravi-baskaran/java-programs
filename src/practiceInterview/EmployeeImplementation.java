package practiceInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeImplementation {

	public static void main(String[] args) {
		
		
//		Employee e1 = new Employee();
//		e1.setAge(25);
//		
//		Employee e2 = new Employee();
//		e2.setAge(25);
//		
//		System.out.println(e1==e2);
//		System.out.println(e1.equals(e2));
//		
//		Collections.sort(null);
		
		
		

		List<Employee> employee = new ArrayList<>();

		employee.add(new Employee("ravi", "dev", 25, 1500, "male"));
		employee.add(new Employee("raj", "hr", 26, 1300, "male"));
		employee.add(new Employee("sam", "dev", 35, 1200, "female"));
		employee.add(new Employee("arun", "hr", 55, 1800, "male"));
		employee.add(new Employee("surya", "dev", 22, 1200, "female"));
		
		
		List<Employee> filter = employee.stream().filter(EmployeeImplementation::isManagerMet).collect(Collectors.toList());
		
		employee.stream().forEach(System.out::println);
		
	//	System.out.println("filter " + filter);
		
		Map<String, Optional<Employee>> collectM = employee.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
		System.out.println(collectM);
		
		
		Employee employee2 = employee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();		
		
		System.out.println(employee2);
		
		
		
		employee.stream().filter(e -> e.getAge()>30).map(e -> e.getSalary()*1.1).forEach(System.out::println);
		
		
		
//		Collections.sort(employee, Comparator.comparing(Employee::getAge).thenComparing(Employee::getName));
//		
//		employee.stream().forEach(System.out::println);
		
		
//		long start = System.currentTimeMillis(); 
//		IntStream.rangeClosed(1, 10).forEach(e -> System.out.println(e + " " + Thread.currentThread().getName()));
//		long stop = System.currentTimeMillis();
//		
//		System.out.println(stop-start);
//		
//		long start1 = System.currentTimeMillis(); 
//		IntStream.rangeClosed(1, 10).parallel().forEach(e -> System.out.println(e + " " + Thread.currentThread().getName()));
//		long stop1 = System.currentTimeMillis();
//		
//		System.out.println(stop1-start1);
		
		
		
		
		

	}
	
	static boolean isManagerMet(Employee emp) {
		
		if(emp.getSalary() > 1200) {
			emp.setManager(true);
		}return false;
		
	}

}
