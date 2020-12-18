
public class Employee {

	int id;
	double Salary;
	String name;
	/*
	public Employee(int id, double salary, String name) {
		super();
		this.id = id;
		Salary = salary;
		this.name = name;
	}
	*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
