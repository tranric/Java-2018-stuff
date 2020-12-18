
public class Student {

	public int id;
	public String firstName;
	public String homeCity;
	public double gpa;



	public Student(int id, String firstName, String homeCity, double gpa) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.homeCity = homeCity;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getHomeCity() {
		return homeCity;
	}
	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


}
