//Richard Tran
//assignment 1
public class Account {
	//variables to hold the values for the accounts.
	private int id = 0;
	private double balance = 0, annualInterestRate=3;
	//prints the balance of the account.
	public void printbalance(){
		System.out.printf("\nThe current amount "
				+ "in the account for id %d is:$%.2f", id, balance);
	}
	//no idea what it is used for but was made on request of the document
	public double getMonthlyInterest(){
		return balance * (annualInterestRate/1200);
	}
	//takes the amount from user/source and takes away from balance
	//if balance is not enough then reverts changes and prints error
	public void withdraw(double withdraw){
		//check for negative value
		if ( (balance - withdraw) < 0 )
		{

			System.out.printf("\nThere is not enough funds "
					+ "available in the account with the id %d", id);
			System.out.printf("\nThe current amount "
					+ "in the account is:$%.2f", balance);

		}
		//processes the transaction
		else
		{
			System.out.printf("\nYou are withdrawing"
					+ " the amount from account %d:$%.2f", id, withdraw);
			balance = balance - withdraw;
			System.out.printf("\nThe withdraw was successful.\nThe new "
					+ "Balance is: $%.2f", balance);
		}

	}

	//adds value to the balance
	public void deposit(double deposit){
		balance = balance + deposit;
		System.out.printf("\nThe desposit was successful.\n"
				+ "The balance of the account is: $%.2f\n"
				+ "The Deposited amount is: $%.2f", balance, deposit);

	}
	//returns the id of the account
	public int getId() {
		return id;
	}
	//sets the id of the account
	public void setId(int id) {
		this.id = id;
	}
	//returns the value of the balance
	public double getBalance() {
		return balance;
	}
	//sets the value of the balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//return the annual interest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

}
