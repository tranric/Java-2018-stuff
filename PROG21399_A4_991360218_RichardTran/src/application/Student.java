package application;

public class Student extends Person{
	private String fullName, address, gpa;

	protected String getFullName() {
		return fullName;
	}

	protected void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Student(String newName, String newAddress, String GPA){
		super(newName, newAddress);
		fullName = newName;
		address = newAddress;
		gpa = GPA;

	}

public String toString(){
	   return (fullName+ " "+ address + " " + gpa);
	  }
protected String getAddress() {
	return address;
}

protected void setAddress(String address) {
	this.address = address;
}

protected String getGpa() {
	return gpa;
}

protected void setGpa(String gpa) {
	this.gpa = gpa;
}

public String currentStatus(){
	return "Student";
}

}
