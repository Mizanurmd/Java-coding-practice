package ComparatorAndComparableExample;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int exprience;
	private int salary;
	private int age;
	
	@Override
	public int compareTo(Employee e) {
		/*
		// sorted to experience ASCE
		if(this.getExprience()> e.getExprience()) {
			return 1;
		}else if(this.getExprience()< e.getExprience()) {
			return -1;
		}else {
			return 0;
		}
		*/
		
		/*
		// sorted to Salary ASCE
		if(this.getSalary()> e.getSalary()) {
			return 1;
		}else if(this.getSalary()< e.getSalary()) {
			return -1;
		}else {
			return 0;
		}
		*/
		
		
		// sorted to Age DSCE
		if(this.getAge()< e.getAge()) {
			return 1;
		}else if(this.getAge()> e.getAge()) {
			return -1;
		}else {
			return 0;
		}
		
		
		
	}
	
	
	public Employee(int id, String name, int exprience, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.exprience = exprience;
		this.salary = salary;
		this.age = age;
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
	public int getExprience() {
		return exprience;
	}
	public void setExprience(int exprience) {
		this.exprience = exprience;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", exprience=" + exprience + ", salary=" + salary + ", age="
				+ age + "]";
	}
	
	
	

}
