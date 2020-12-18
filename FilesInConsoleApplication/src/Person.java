public class Person {
	private String firstname;
	private String lastname;
	private int _idNumber;
	public Person(String name, String surname, int idNumber) {
		this.firstname = name;
		this.lastname = surname;
		this._idNumber = idNumber;
	}
	public Person() {
		this.firstname = "";
		this.lastname = "";
		this._idNumber = 0;
	}

	public String getfirstname() {
		return firstname;
	}

	public String getlastname() {
		return this.lastname;
	}

	public int getIdNumber() {
		return this._idNumber;
	}
	@Override
	public String toString() {
		return this.firstname+ " " + this.lastname +" "+ this._idNumber;
	}
}
