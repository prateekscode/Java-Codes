package com.practice;

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

	int id;
	String name;
	int age;
	String gender;
	String dept;
	int joinyear;
	double sal;
	
	public Employee(int id, String name, int age, String gender, String dept, int joinyear, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.joinyear = joinyear;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getJoinyear() {
		return joinyear;
	}

	public void setJoinyear(int joinyear) {
		this.joinyear = joinyear;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", joinyear=" + joinyear + ", sal=" + sal + "]";
	}
	
	public static void main(String[] args) {
		List<Employee> list =new ArrayList<Employee>();
		
		list.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		list.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		list.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		list.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		list.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		list.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		list.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		list.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		list.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		list.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		list.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		list.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		list.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		list.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		list.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		list.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		list.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		//No. of male female emp
		Map<String, Long> noOFMaleFemEmp = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOFMaleFemEmp);
		
		//name of all dept
		list.stream().map(Employee::getDept).distinct().forEach(System.out::println);
		
		//we can also find distinct using toSet
//		Set<String> collect2 = list.stream().map(Employee::getDept).collect(Collectors.toSet());
//		System.out.println(collect2);
		
		//avg age of male female emp
		Map<String, Double> avgAge = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAge);
		
		////details of highest paid emp
		Optional<Employee> highPaidEmp = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSal)));
		Employee highestpaid = highPaidEmp.get();
		System.out.println(highestpaid);
		
		//emp names joined after 2015
		list.stream().filter(e->e.getJoinyear()>2015).map(Employee::getName).forEach(System.out::println);
		
		//count no. of emp in each dept
		Map<String, Long> noOfEmpInDept = list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		Set<Entry<String, Long>> entrySet = noOfEmpInDept.entrySet();
		for(Entry<String,Long> entry:entrySet)
			System.out.println(entry.getKey()+": "+entry.getValue());
		
		//avg salary of each dept
		Map<String, Double> AvgSalOfEachDept = list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSal)));
		Set<Entry<String, Double>> entrySet2 = AvgSalOfEachDept.entrySet();
		for(Entry<String,Double> entry:entrySet2)
		System.out.println(entry.getKey()+": "+entry.getValue());
		
		
		//details of youngest male emp in product development dept
		Optional<Employee> youngMaleEmp = list.stream().filter(e->e.getGender()=="Male" && e.getDept()=="Product Development").min(Comparator.comparingInt(Employee::getAge));
		Employee emp = youngMaleEmp.get();
		System.out.println(emp);
		
		//most work exp in org
		Optional<Employee> mostWorkExp = list.stream().sorted(Comparator.comparingInt(Employee::getJoinyear)).findFirst();
		Employee emp1 = mostWorkExp.get();
		System.out.println(emp1);
		
		//no. of male female emp in sales and marketing
		Map<String, Long> empInSalesMarket = list.stream().filter(e->e.getDept()=="Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(empInSalesMarket);
		
		//avg sal of male female emp
		Map<String, Double> AvgSalEmp = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSal)));
		System.out.println(AvgSalEmp);
		
		//names of all emp in each dept
		Map<String, List<Employee>> namesofAllEmpInEachDept = list.stream().collect(Collectors.groupingBy(Employee::getDept));
		Set<Entry<String, List<Employee>>> entrySet3 = namesofAllEmpInEachDept.entrySet();
		for (Entry<String, List<Employee>> entry : entrySet3) {
			System.out.println("_________________");
			System.out.println("Emp in "+entry.getKey()+":");
			System.out.println("---------------");
			
			List<Employee> li=entry.getValue();
			for(Employee e:li)
				System.out.println(e.getName());
		}
		
		//avg sal and total sal of whole org
		DoubleSummaryStatistics avgAndTotalSalOfOrg = list.stream().collect(Collectors.summarizingDouble(Employee::getSal));
		System.out.println("Total Salary: "+avgAndTotalSalOfOrg.getSum());
		System.out.println("Average Salary: "+avgAndTotalSalOfOrg.getAverage());
	
		//separate the employees younger or equal to 25 from those older than 25.
		Map<Boolean, List<Employee>> collect = list.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
		Set<Entry<Boolean, List<Employee>>> entrySet4 = collect.entrySet();
		for (Entry<Boolean, List<Employee>> entry : entrySet4) {
			System.out.println("________________________");
			if(entry.getKey()) {
				System.out.println("Older than 25");
			}
			else {
				System.out.println("Younger tahn 25");
			}
			System.out.println("------------------------");
			List<Employee> l=entry.getValue();
			for(Employee e: list)
				System.out.println(e.getName());
		}
		
		//oldest emp in org what is his age and dept
		Optional<Employee> oldestEmp = list.stream().max(Comparator.comparingInt(Employee::getAge));
		Employee em = oldestEmp.get();
		System.out.println("Name="+em.getName()+" Age: "+em.getAge()+" Department: "+em.getDept());
	}

	
}