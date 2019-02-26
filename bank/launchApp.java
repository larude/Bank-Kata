package bank;


import static bank.DateF.date;
import static bank.Amount.amountOf;

import bank.Account;
import bank.Statement;

public class launchApp {

	
	public static void main(String[] args) {
		Account account = new Account(new Statement());
		
		account.deposit(amountOf(1500), date("10/01/2012"));
		account.deposit(amountOf(650), date("13/01/2012"));
		account.withdrawal(amountOf(800), date("14/01/2012"));
		
		account.printStatement(System.out);
	}
}
