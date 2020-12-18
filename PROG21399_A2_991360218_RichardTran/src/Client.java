/**
 *
 * @author Richard Tran
 * @version 1.0
 * @since 2018-06-04 (YYYY-MM-DD)
 *
 * Description of Client: Setup of a object client that has an account as well as
 * personal information
 */
public class Client {


	String First_Name="", Last_Name="", Email_Address="", Phone_Number="";
	Account clientaccount = new Account();

	/**
	 *
	 * @return First_Name - Returns the first name of the client
	 */
	public String getFirst_Name() {
		return First_Name;
	}
	/**
	 *
	 * @param first_Name sets First name of the client
	 */
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	/**
	 *
	 * @return Last_Name - returns the last name of the client
	 */
	public String getLast_Name() {
		return Last_Name;
	}
	/**
	 *
	 * @param last_Name sets the Last name of the client
	 */
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	/**
	 *
	 * @return Email_Address - Returns the email address of the client
	 */
	public String getEmail_Address() {
		return Email_Address;
	}
	/**
	 *
	 * @param email_Address sets the email address of the client
	 */
	public void setEmail_Address(String email_Address) {
		Email_Address = email_Address;
	}
	/**
	 *
	 * @return Phone_Number - Returns the phone number of the client
	 */
	public String getPhone_Number() {
		return Phone_Number;
	}
	/**
	 *
	 * @param phone_Number sets the phone number of the client
	 */
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}

	/**
	 *
	 * @param client - prints all of the information of the client.
	 */
	public String toString(){
		return "\nClient's First Name:"+ getFirst_Name() +
				"\nClient's Last Name:" + getLast_Name() +
				"\nClient's Phone Number:" +  getPhone_Number() +
				"\nClient's Email Address:" + getEmail_Address() +
				"\nClient's id is " + clientaccount.getId() +
				"\nClient's balance is " + clientaccount.getBalance();
	}
	/*
	 //not to overwrite the default tostring class
	public void ClientToString(Client client){
		System.out.printf("\nClient's First Name:%s",client.getFirst_Name());
		System.out.printf("\nClient's Last Name:%s", client.getLast_Name());
		System.out.printf("\nClient's Phone Number:%s", client.getPhone_Number());
		System.out.printf("\nClient's Email Address:%s", client.getEmail_Address());
		System.out.printf("\nClient's id is %d", client.clientaccount.getId());
		System.out.printf("\nClient's balance is %f", client.clientaccount.getBalance());

	}
	*/


}
