import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Encryption {

	/*
	 	If the account is a �Current� account,
	  	multiply the balance with the length of it�s customer name.

 		If the account is a �Deposit� account,
 		add the balance to the length of its customer name.

		meant for encrypting the balance alone
		 without the account holder's name


	 */

	//private String encryptiontype;

	private int id;
	private String type;
	private String name;
	private double balance;

	public void Encrypt(int id, String type, String name, double balance )
			throws FileNotFoundException, IOException{

		this.id = id;
		this.type = type;
		this.name = name;
		this.balance = balance;

		if(type.equals("Current")){
			//System.out.println("balance before encryption: " + this.balance);
			Current_encrypt(this.id, this.type, this.name, this.balance);
			//System.out.println("balance after encryption: " + this.balance);
		}
		else if(type.equals("Deposit")){
			//System.out.println("balance before encryption: " + this.balance);
			Deposit_encrypt(this.id, this.type, this.name, this.balance);
			//System.out.println("balance after encryption: " + this.balance);
		}
		Account accountencrypt = new Account(this.id, this.type, this.balance);
		ObjectOutputStream output =
				new ObjectOutputStream (new FileOutputStream("account.dat"));

		output.writeObject(accountencrypt);

		System.out.println("Encrypted information: " +
		"\nID: " + accountencrypt.getAccountId() + "\nAccount Type: " +
		accountencrypt.getAccountType() +
		"\nAccount Balance(Encryped not true balance): " +
		accountencrypt.getBalance());

		output.close();


	}

	public void Current_encrypt(int id, String type, String name, double balance){

		this.balance = balance * name.length();

	}

	public void Deposit_encrypt(int id, String type, String name, double balance){

		this.balance = balance + name.length();


	}


}
