package bank;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Statement {
	
	private static int TOP_LIST = 0;

	public static String HEADER = "Date        |Credit        |Debit         |Balance       ";

	private List<StatementReport> statementReports = new LinkedList<StatementReport>();
	
	public void addLineContaining(Transaction transaction, Amount currentBalance) {
		statementReports.add(TOP_LIST, new StatementReport(transaction, currentBalance));
	}
	
	public void printTo(PrintStream printer) {
		printer.println(HEADER);
		printStatementReport(printer);
	}

	private void printStatementReport(PrintStream printer) {
		for (StatementReport statementReport : statementReports) {
			statementReport.printTo(printer);
		}
	}

}
