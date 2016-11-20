import java.awt.Dimension;
import java.math.BigDecimal;

import javax.swing.JFrame;

public class Main {


	private static final Dimension SIZE = new Dimension(340, 120);
	private static final BigDecimal INITIAL_DEPOSIT = new BigDecimal(100);	

	public static void main(final String... theArgs) {
		
		JFrame frame = new JFrame("Bank Account");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(SIZE);
		frame.setResizable(false);
		final BankAccountGUI theGUI = new BankAccountGUI();
		frame.add(theGUI);
		theGUI.myAccount.deposit(INITIAL_DEPOSIT);
		frame.setVisible(true);
		
	}

}
