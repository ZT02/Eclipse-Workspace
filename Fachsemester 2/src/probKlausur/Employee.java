package probKlausur;

import java.util.LinkedList;
import java.util.List;

public class Employee {
	private Integer age;
	private String gender;
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(Integer age, String gender, String firstName, String lastName, double salary) {
		this.age = age;
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public double getSalary() {
		
		return salary;
	}
	
	public static double calculateAverage(List<Employee> employeeList) {
		return employeeList.stream().mapToDouble(d -> d.getSalary()).average().getAsDouble();
	}
	public static void main(String[] args) {
	Employee e1 = new Employee(18, "female", "Dominik", "Toretto", 1);	
	Employee e2 = new Employee(18, "female", "Dominik", "Toretto", 1);
	Employee e3 = new Employee(18, "female", "Dominik", "Toretto", 1);
	List<Employee> le = new LinkedList<Employee>();
	le.add(e1);
	le.add(e2);
	le.add(e3);
	System.out.println(calculateAverage(le));
	}
}
