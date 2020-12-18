
public class Manager extends Employee{

	String role;

	public Manager(int id, double salary, String name, String role) {
		//super(id, salary, role);

		super.id = id;
		super.Salary = salary;
		super.name = name;
		this.role = role;

	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

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
