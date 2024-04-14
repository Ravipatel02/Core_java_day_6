package Question5;

public class BankAccount {
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	// create deposit method 
	
	public synchronized void deposit(double amount) {
		System.out.println(Thread.currentThread().getName()+" depositing balance "+amount);
		balance += amount;
		System.out.println("new balance after deposit "+balance);
	}
	
	// create withdraw method 
	
	public synchronized void withdrow(double amount) {
		if(balance>=amount) {
			System.out.println(Thread.currentThread().getName() + " withdrawing ..." +amount);
			balance -= amount;
			System.out.println("new Balence after withdrawing "+ balance);
		}else {
			System.out.println(Thread.currentThread().getName() + " can not withde "+amount +" do to insufficient balance !");
		}
	}
	
	
	
	// create checkBaalence method 
	
	public synchronized double checkBalance() {
		System.out.println(Thread.currentThread().getName() +" checking balence ");
		return balance;
	}

}
