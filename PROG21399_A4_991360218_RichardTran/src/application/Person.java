package application;

public abstract class Person
{
	private String fullName;
	private String address;


  public Person(String newName, String newAddress)
  {
	fullName = newName;
	address = newAddress;

  }

  @Override
  public String toString(){
   return (fullName+ " "+ address);
  }
  public abstract String currentStatus();


}