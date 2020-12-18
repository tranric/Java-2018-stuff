//richard tran
public class TestAccount {

	public static void main(String[] args) {
		//creates new objects of the accounts
		Account account1 = new Account();
		Account account2 = new Account();
		//sets id
		account1.setId(1);
		account2.setId(2);
		//sets balance to 0
		account1.setBalance(0);
		account2.setBalance(0);
		//adds to the balance
		account1.deposit(1000);
		account2.deposit(2000);
		//withdraw from the balance
		account1.withdraw(200);
		account2.withdraw(450);
		//prints the balance of each account
		account1.printbalance();
		account2.printbalance();
	}

}
