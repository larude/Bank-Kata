package bank;

import java.io.PrintStream;


public class StatementReport {
	
	private Transaction transaction;
	private Amount currentBalance;

	public StatementReport(Transaction transaction, Amount currentBalance) {
		this.transaction = transaction;
		this.currentBalance = currentBalance;
	}

	public void printTo(PrintStream printer) {
		this.transaction.printTo(printer, currentBalance);
	}

}
