/**
 * @(#)LoanCalculation.java
 *
 *
 * @author 
 * @version 1.00 2015/9/29
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoanCalculation extends JFrame {

	private JTextField jtfAnnualIntersetRate = new JTextField();
	private JTextField jtfNumberOfYears = new JTextField();
	private JTextField jtfLoanAmount = new JTextField();
	private JTextField jtfMonthlyPayment = new JTextField();
	private JTextField jtfTotalPayment = new JTextField();
	private JButton jbtComputePayment = new JButton("Compute Payment");

    public LoanCalculation() {
    	setLayout(new BorderLayout());
    	JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    	JPanel p2 = new JPanel(new GridLayout(5, 2));
    	JPanel p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    	
    	p1.add(new JLabel("Enter loan amount, interset rate, and year"));
    	
    	p2.add(new JLabel("Annual Interset Rate"));
    	p2.add(jtfAnnualIntersetRate);
    	p2.add(new JLabel("Number of Years"));
    	p2.add(jtfNumberOfYears);
    	p2.add(new JLabel("Loan Amount"));
    	p2.add(jtfLoanAmount);
    	p2.add(new JLabel("Monthly Payment"));
    	p2.add(jtfMonthlyPayment);
    	p2.add(new JLabel("Total Payment"));
    	p2.add(jtfTotalPayment);
    	
    	p3.add(jbtComputePayment);
    	
    	add(p1, BorderLayout.NORTH);
    	add(p2, BorderLayout.CENTER);
    	add(p3, BorderLayout.SOUTH);
    	
    	jbtComputePayment.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			double interest = Double.parseDouble(jtfAnnualIntersetRate.getText());
    			int year = Integer.parseInt(jtfNumberOfYears.getText());
    			double loanAmount = Double.parseDouble(jtfLoanAmount.getText());
    			
    			Loan loan = new Loan(interest, year, loanAmount);
    			
    			jtfMonthlyPayment.setText(String.format("%.2f", loan.getMonthlyPayment()));
    			jtfTotalPayment.setText(String.format("%.2f", loan.getTotalPayment()));
    		}
    	}
    	);
    }
    
    public static void main(String[] args) {
    	JFrame frame = new LoanCalculation();
    	frame.pack();
    	frame.setTitle("A Loan Calculation");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
    
    
}
class Loan {
	private double interest;
	private int year;
	private double loanAmount;
	
	public Loan(double _interest, int _year, double _loanAmount) {
		interest = _interest;
		year = _year;
		loanAmount = _loanAmount;
	}
	
	public double getMonthlyPayment() {
		return loanAmount * interest;
	}
	
	public double getTotalPayment() {
		return getMonthlyPayment() * 12 * year + loanAmount;
	}
}