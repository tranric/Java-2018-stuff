//Richard Tran
//assignment 1
/**
 *
 * @author Richard Tran
 * @version 1.0
 * @since 2018-06-04 (YYYY-MM-DD)
 *
 * Description of Account Class: used to create an account consisting of
 * an id, balance,and an annual interest rate.
 *
 */
public class Account {
/**
 * @param id - gives a unique id for each account
 * @param balance - gives a balance to use the withdraw or deposit methods
 * @param annualInterestRate - gives an annual interest rate on each account of 3%
 *
 */
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
	/**
	 *
	 * @param withdraw - withdraws a double value to reduce from the balance
	 * if the balance is lower then the withdraw amount then it does not
	 * goes through with the changes to prevent a negative balance value.
	 */
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
	/**
	 *
	 * @param deposit - add a double value to the balance
	 */
	public void deposit(double deposit){
		balance = balance + deposit;
		System.out.printf("\nThe desposit was successful.\n"
				+ "The balance of the account is: $%.2f\n"
				+ "The Deposited amount is: $%.2f", balance, deposit);

	}
	//returns the id of the account
	/**
	 *
	 * @return id - an int
	 */
	public int getId() {
		return id;
	}
	//sets the id of the account
	/**
	 *
	 * @param id - sets the id of the account
	 */
	public void setId(int id) {
		this.id = id;
	}
	//returns the value of the balance
	/**
	 *
	 * @return balance - a double
	 */
	public double getBalance() {
		return balance;
	}
	//sets the value of the balance
	/**
	 *
	 * @param balance sets the balance a double value
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//return the annual interest rate
	/**
	 *
	 * @return annualInterestRate an int
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

}
