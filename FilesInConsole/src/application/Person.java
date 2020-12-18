package application;

public class Person {
	private String _name;
	private String _surname;
	private int _idNumber;
	public Person(String name, String surname, int idNumber) {
		this._name = name;
		this._surname = surname;
		this._idNumber = idNumber;
	}
	public Person() {
		this._name = "";
		this._surname = "";
		this._idNumber = 0;
	}

	public String getName() {
		return _name;
	}

	public String getSurname() {
		return this._surname;
	}

	public int getIdNumber() {
		return this._idNumber;
	}
	@Override
	public String toString() {
		return this._name+ " " + this._surname +" "+ this._idNumber;
	}
}
