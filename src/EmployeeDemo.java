import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("a");
		Employee e2 = new Employee();
		e2.setName("a");
		
	//	System.out.println(e1.equals(e2));
		

//		List<Employee> employee = Arrays.asList(new Employee("ravi", "dev", 25, 1500, "male"),
//				                               (new Employee("raj", "hr", 26, 1500, "male")),
//				                               (new Employee("sam", "dev", 35, 1500, "female")),
//				                               (new Employee("arun", "hr", 55, 1500, "male")),
//				                               (new Employee("surya", "dev", 28, 1500, "female")));
		
		List<Employee> employee = new ArrayList<>();
		
		employee.add(new Employee("ravi", "dev", 25, 1500, "male"));
		employee.add(new Employee("raj", "hr", 26, 1300, "male"));
		employee.add(new Employee("sam", "dev", 35, 1200, "female"));
		employee.add(new Employee("arun", "hr", 55, 1800, "male"));
		employee.add(new Employee("deepa", "dev", 22, 800, "female"));
		employee.add(new Employee("surya", "dev", 22, 1200, "female"));

		Employee minSl = employee.stream().filter(e -> e.getDepartment().equalsIgnoreCase("dev"))
				.min(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(minSl);


		System.out.println("---------------------");
		
		
		

	
	Employee cus = 	employee.stream().filter(e -> e.getDepartment().equals("hr") && e.getGender().equals("male"))
		.collect(Collectors.minBy(Comparator.comparing(Employee::getAge))).get();
	
	System.out.println("custom: " + cus);

		
		
		
		
		//Find count of employees based on gender
		Map<String, Long> gen = employee.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		System.out.println(gen);
		
		
		//Find average age of male and female employees 
		Map<String, Double> aveAge = employee.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		
		System.out.println(aveAge);
		
		
		//Print name of all department
		employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		
		//Highesh salary employee 
		Employee maxEmp = employee.stream()
				.max(Comparator.comparing(Employee::getSalary)).orElse(new Employee("ravi", "dev", 25, 1500, "male"));
		System.out.println("max emp :" + maxEmp);
		
		
		//Find count of employees based on gender
		Map<String, Long> depCount = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
				
		depCount.forEach((k,v) -> System.out.println(k+" : "+v));
		
		
		//Highest salary employee in each department
		Map<String, Employee> maxByDepartment = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),Optional::get)));
		
		maxByDepartment.forEach((k,v) -> System.out.println(k+" : "+v));
		
		
		//Average salary of each department
		Map<String, Double> aveSalaryDep = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(aveSalaryDep);
		
		
		//Find same salary employees 
		Map<Integer, List<Employee>> collect11 = employee.stream()
				.collect(Collectors.groupingBy(Employee::getSalary));
		System.out.println();
		System.out.println(collect11);
		
		collect11.entrySet().stream().filter(e -> e.getValue().size()>1).forEach(System.out::println);
		
		
		//youngest employee in HR department and also should be male
		Optional<Employee> collectYoung = employee.stream()
				.filter(e -> e.getDepartment().equalsIgnoreCase("dev") && e.getGender().equalsIgnoreCase("male"))
		.collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		
		System.out.println(collectYoung);
		
       
		

		
		
		
		
		
		
		
		//Find employee names
		
		//Find Highest salary employee
		
		//Group employees based on gender
		
		//Group employees by department and highest salary
		
		//Find employees from 'dev' department
		
		//Find 3nd highest salary employee ant only name
		
		String thirdSal = employee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
		.map(Employee::getName).skip(2).findFirst().get();
		
		System.out.println("thirdSal :" + thirdSal);
		
		//Find Highest salary employee with only name
		
		
		Employee max = employee.stream()
		.collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get));
		
		String maxName = max.getName();
		
		System.out.println("maxName :" + maxName);
		
		
		Map<String, Optional<Employee>> maxByDep = employee.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
		//System.out.println(maxByDep);
		
//		employee.stream()
//		.filter( e -> e.getDepartment().equals("dev"))
//		.filter(e -> e.getSalary()>1200)
//		.forEach(System.out::println);
		
		
		
		Employee nthHighestSalary = employee.stream()
		.sorted(Comparator.comparing(Employee::getSalary).reversed())
		.collect(Collectors.toList())
		.get(1);
		
	//	System.out.println(nthHighestSalary);
		
		
		
		//Highest salary employee with only name
		Map<Integer, List<String>> mapSalary = employee.stream()
		.collect(Collectors.groupingBy(Employee::getSalary, 
				Collectors.mapping(Employee::getName, Collectors.toList())));
		
		Entry<Integer, List<String>> entry = mapSalary.entrySet().stream()
		.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
		.collect(Collectors.toList())
		.get(0);
		
	//	System.out.println(entry);
		
		
		
		
		
		
		//Functional Interface demo
		DemoFunctionalInterface fun = (a,b) -> a+b;
		
		System.out.println(fun.addition(4, 4));
		
		
		

	}

}
