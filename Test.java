package bankaccount;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account= new BankAccount();
		Scanner input = new Scanner(System.in);
		int choice;
		do {
			System.out.println("BANK ACCOUNT");
			System.out.println("1.DEPOSIT");
			System.out.println("2.WITHDRAWAL");
			System.out.println("3.VIEW CURRENT BALANCE");
			System.out.println("4.EXIT");
			System.out.println("Select an option ");
			choice=input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Deposit Amount");
				account.deposit(input.nextInt());
				break;
				
			case 2:
				System.out.println("Current Balance = "+account.getBalance());
				System.out.println("Enter withdrawal amount");
				try {
					account.withdraw(input.nextInt());
				} catch (InSufficientFundException e) {
					System.out.println(e.toString());
					break;
				}
			case 3:
				System.out.println("Current Balance = "+account.getBalance());
			}
		} while(choice !=4);
		

	}

}
