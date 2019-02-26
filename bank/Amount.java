package bank;

import java.text.DecimalFormat;



public class Amount {

	private DecimalFormat decimalFormat = new DecimalFormat("#.00");	
	
	private int value;

	public Amount(int value) {
		this.value = value;
	}

	public static Amount amountOf(int value) {
		return new Amount(value);
	}
	
	public Amount add(Amount diffAmount) {
		return amountOf(this.value + diffAmount.value);
	}
	
	public boolean isGreaterThan(Amount addAmount) {
		return this.value > addAmount.value;
	}
	
	public Amount absoluteValue() {
		return amountOf(Math.abs(value));
	}
	
	public String moneyFormat() {
		return decimalFormat.format(value);
	}
	
	public Amount negative() {
		return amountOf(-value);
	}
	
	@Override
	public boolean equals(Object object) {
		Amount diff = (Amount) object;
		if (value != diff.value) {
			return false;
		}
		else
		{
			return true;
		}

	}
}