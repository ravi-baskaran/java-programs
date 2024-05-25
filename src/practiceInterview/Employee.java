package practiceInterview;

import java.util.Objects;

public class Employee {
	
	private String name;
	private String department;
	private int age;
	private int salary;
	private String gender;
	private boolean isManager;
	
	
	public boolean isManager() {
		return isManager;
	}


	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, department, gender, name, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(department, other.department) && Objects.equals(gender, other.gender)
				&& Objects.equals(name, other.name) && salary == other.salary;
	}


	public Employee() {
		super();
	}


	public Employee(String name, String department, int age, int salary, String gender) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", age=" + age + ", salary=" + salary
				+ ", gender=" + gender + ", isManager=" + isManager + "]";
	}


	
	
	
	

}
