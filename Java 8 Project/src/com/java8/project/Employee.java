package com.java8.project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);

		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		Map<String, Double> AvgAgeOfMaleFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(AvgAgeOfMaleFemale);

		Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		Employee highPaidEmployee = highestPaidEmployeeWrapper.get();
		System.out.println(highPaidEmployee);

		employeeList.stream().filter(x -> x.getYearofjoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);

		Map<String, Long> countEmployeeByDept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Set<Entry<String, Long>> entrySet = countEmployeeByDept.entrySet();
		System.out.println(entrySet);
		System.out.println(countEmployeeByDept);
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		Map<String, Double> AvgSalaryOfDept = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		Set<Entry<String, Double>> entrySet2 = AvgSalaryOfDept.entrySet();
		System.out.println(entrySet2);

		Optional<Employee> youngestMaleEmpInPrdDepart = employeeList.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(Employee::getAge));
		Employee employee = youngestMaleEmpInPrdDepart.get();
		System.out.println(employee);

		Optional<Employee> mostWorkExpInOrg = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearofjoining)).findFirst();
		Employee employee2 = mostWorkExpInOrg.get();
		System.out.println(employee2);

		Map<String, Long> MaleAndFemaleEmpInSalesAndAmarket = employeeList.stream()
				.filter(e -> e.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		Set<Entry<String, Long>> entrySet3 = MaleAndFemaleEmpInSalesAndAmarket.entrySet();
		System.out.println(entrySet3);

		Map<String, Double> AvgSalOfMaleFemalEmp = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(AvgSalOfMaleFemalEmp);
		System.out.println("***********************************************************************");

		Map<String, List<Employee>> NamesOfAllEmpInEachDept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>> entrySet4 = NamesOfAllEmpInEachDept.entrySet();
		for (Entry<String, List<Employee>> entry : entrySet4) {
			System.out.println("---------------");
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		DoubleSummaryStatistics EmplAvgAndTotalSalary = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary: " + EmplAvgAndTotalSalary.getAverage());
		System.out.println("Total Salary: " + EmplAvgAndTotalSalary.getSum());
		System.out.println("''''''''''''''''''''''''''''''");

		Map<Boolean, List<Employee>> partitioningEmplByAge = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		Set<Entry<Boolean, List<Employee>>> entrySet5 = partitioningEmplByAge.entrySet();

		for (Entry<Boolean, List<Employee>> entry : entrySet5) {
			System.out.println("___________________________");
			if (entry.getKey())
				System.out.println("Employees older than 25 years");
			else
				System.out.println("Employees younger than or equal to 25 years");

			System.out.println("----------------------------");
			List<Employee> list = entry.getValue();
			for (Employee e : list)
				System.out.println(e.getName());
		}
		System.out.println(":::::::::::::::::::::::::::");
		Optional<Employee> oldestEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		Employee employee3 = oldestEmployee.get();
		System.out.println("Name: "+employee3.getName());
		System.out.println("Age: "+employee3.getAge());
		System.out.println("Department: "+employee3.getDepartment());
	}

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearofjoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearofjoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearofjoining = yearofjoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearofjoining() {
		return yearofjoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearofjoining=" + yearofjoining + ", salary=" + salary + "]";
	}

}
