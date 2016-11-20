import java.math.BigDecimal;
import java.util.Observable;

public class BankAccount extends Observable{
	
	private BigDecimal myBalance;
	public BankAccount() {
		super();
		myBalance = BigDecimal.ZERO;
		
	}
	
	public void deposit(final BigDecimal theAmount) {
		
		myBalance = myBalance.add(theAmount);
		reportChange();
	}
	
	public void withdrawal(final BigDecimal theAmount) {
		
		if (theAmount.doubleValue() <= myBalance.doubleValue())
			myBalance = myBalance.subtract(theAmount);
		reportChange();
	}

	private void reportChange() {
		
		setChanged();
		notifyObservers(myBalance);
	}
}
