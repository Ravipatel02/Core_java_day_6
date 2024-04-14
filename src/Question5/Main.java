package Question5;

public class Main {
	
	public static void main(String[] args) {
		// creating account with initial balance $1000
		BankAccount bank = new BankAccount(1000);
		
		// crating thread 
		
		Thread thread0 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				bank.deposit(300);
				
			}
		});
		
		Thread thread1 = new Thread(()->{
			bank.deposit(700);
		});
		Thread thread2 = new Thread(()->{
			bank.withdrow(500);
		});
		Thread thread3 = new Thread(()->{
			bank.withdrow(600);
		});
		Thread thread4 = new Thread(()->{
			double balance = bank.checkBalance();
			System.out.println(balance);
		});
		
		thread0.start();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
