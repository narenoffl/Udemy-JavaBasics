public class BankAccount {
	
	private double balance;

   // Constructor
   public BankAccount() {
	   balance = 0.0;
   }
	  //deposit methods
   public void deposit(double amount) {
	   balance=balance+amount;
   }
   //withdrawal methods
   public void withdraw(double amount) throws InSufficientFundException {
	   if(amount>balance) {
		   throw new InSufficientFundException("Insufficient Balance");
	   }
	   balance=balance-amount;
   }
   //getter methods of balance 
   public double getBalance() {
	return balance;
}
   
	
}
