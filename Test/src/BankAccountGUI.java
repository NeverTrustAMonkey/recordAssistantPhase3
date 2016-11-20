
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BankAccountGUI extends JPanel implements Observer {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3632951800685356935L;

	
	 BankAccount myAccount;
	JLabel myBalanceLabel;
	JRadioButton myDepositButton;
	
	public BankAccountGUI() {
		
		super();
		setLayout(new GridLayout(3,2));
		
		myAccount = new BankAccount();
		myAccount.addObserver(this);
		
		setupBalance();
		setupButtons();
		setupAmountField();
		
		
	}


	

	private void setupBalance() {
		add(new JLabel ("Account Balance:"));
		myBalanceLabel = new JLabel();
		add(myBalanceLabel);
	}
	
	private void setupButtons() {

		add(new JLabel("Transaction Type :"));
		myDepositButton = new JRadioButton("Deposit");
		myDepositButton.setSelected(true);
		myDepositButton.setFocusable(false);
		JRadioButton withdrawButton = new JRadioButton("Withdraw");
		withdrawButton.setFocusable(false);
		ButtonGroup theGroup = new ButtonGroup();
		theGroup.add(myDepositButton);
		theGroup.add(withdrawButton);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(myDepositButton);
		buttonPanel.add(withdrawButton);
		add(buttonPanel);
		
		
	}
	
	
	
	private void setupAmountField() {


			add(new JLabel("Transaction Amount :"));
			JTextField amountField = new JTextField();
			amountField.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					try {
						final double theAmount = Double.parseDouble(arg0.getActionCommand());
					
					if( myDepositButton.isSelected()) {
						myAccount.deposit(new BigDecimal(theAmount));
					} else {
						myAccount.withdrawal(new BigDecimal(theAmount));
						
					}		
				}
					catch (final NumberFormatException e) {
						
					}
				}
				
			});
			add(amountField);
		
	}
	
	@SuppressWarnings("unused")
	private String formatBigDecimalForCurrency(BigDecimal theNumber) {
		
		return String.format("$%.2f", (theNumber).doubleValue());
	}
	

	
	
	
	
	
	@Override
	public void update(Observable arg0, Object theArg) {


		if (theArg instanceof BigDecimal) {
			
			BigDecimal x = (BigDecimal)theArg;
			 
			String y = formatBigDecimalForCurrency(x);
			myBalanceLabel.setText(y);
			
			 
		}
		
	
	}
	

	
	
	
	
	
	

}
