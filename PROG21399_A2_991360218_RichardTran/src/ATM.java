/**
 *  @author Richard Tran
 *  @version 1.0
 *  @since 2018-06-04 (YYYY-MM-DD)
 *
 * Description of ATM: Setup an array maximum size of 3 of an object "Client" from
 * from the Client Class file and creates a new user of class.
 * Has a menu to interact with a user using the Client and Account classes.
 *
 *
 */

import java.util.Scanner;

public class ATM {

	/**
	 * @param x - used to control the menu
	 * @param users - used to control the array of users
	 */
	public void run(){

		int x=0;
		Scanner input = new Scanner(System.in);
		//creates array of users
		Client [] users = new Client[3];
		users[0]= new Client();
		//asks user for initialization of the user.
		System.out.println("Please enter your personal information:");
		System.out.println("\n***************************");
		System.out.print("\nPlease Enter the client's first name:");
		users[0].setFirst_Name(input.nextLine());
		System.out.print("\nPlease Enter the client's last name:");
		users[0].setLast_Name(input.nextLine());
		System.out.print("\nPlease Enter the client's email address:");
		users[0].setEmail_Address(input.nextLine());
		System.out.print("\nPlease Enter the client's phone number:");
		users[0].setPhone_Number(input.nextLine());
		users[0].clientaccount.setId(999);
		System.out.println("\n***************************");
		System.out.print("\nPlease Enter the client's inital balance:");
		users[0].clientaccount.setBalance(input.nextDouble());

		System.out.println("\nYour account is being created");
		System.out.println("\n***************************");


		//prints menu and makes the statements to call methods.
		while(x!=5){
			System.out.println("\nSelect from the following menu options below:");
			System.out.println("[1] Check Balance");
			System.out.println("[2] Withdraw");
			System.out.println("[3] Deposit");
			System.out.println("[4] Show Personal Details");
			System.out.println("[5] Exit");
			System.out.println("========================");
			System.out.print("Please select your option now: ");
			x=input.nextInt();
			if (x==1){
				System.out.printf("\nBalance:%.2f\n"
						+ "",users[0].clientaccount.getBalance());
			}
			else if(x==2){
				System.out.print("\nEnter withdraw amount:");
				users[0].clientaccount.withdraw(input.nextDouble());
			}
			else if(x==3){
				System.out.print("\nEnter deposit amount:");
				users[0].clientaccount.deposit(input.nextDouble());
			}
			else if(x==4){
				//users[0].ClientToString(users[0]);
				System.out.print(users[0]);
			}
			else if (x==5){
				break;
			}
			else{
				System.out.println("Incorrect input. Enter options from 1-5!");
			}
		}

		//exits the program with a message.
		input.close();
		System.out.println("Thanks for banking with us. Have a great day!");
		System.exit(0);

	}


}
