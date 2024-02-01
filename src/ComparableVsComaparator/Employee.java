package ComparableVsComaparator;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private String address;
	private String city;
	private int age;
	public Employee(int id, String name, String address, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", age=" + age
				+ "]";
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.age -e.age;
	}
	
	

}
