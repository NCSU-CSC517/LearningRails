package dependencyinversion.bad;

public class CheckingAccount {
	int balance;
	double interest_rate = 0.003;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		if ( balance >= amount)
			balance -= amount;
		else
			throw new UnsupportedOperationException("Insufficient Funds!");
	}
	
	public void deposit(int amount) {
		balance+=amount;
	}
}
