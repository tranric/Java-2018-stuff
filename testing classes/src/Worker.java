
public class Worker extends Employee{
	String schedule;

	public Worker(int id, double salary, String name, String schedule) {


		super.id = id;
		super.Salary = salary;
		super.name = name;
		this.schedule = schedule;

	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
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
