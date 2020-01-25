// JAC444NEE
// Valentina Derksen
// Student id: 153803184

import java.util.Scanner;
import java.text.DecimalFormat; 

public class Task2 {

	
	public static double calculateMonthlyPayment(
		      int loanAmount, int termInYears, double interestRate) {
		       
		      // Monthly interest rate is the yearly rate divided by 12
		       
		      double monthlyRate = interestRate / 12.0;
		       
		      // The length of the term in months is the number of years times 12
		       
		      int termInMonths = termInYears * 12;
		       
		      // Calculate the monthly payment
		      // The Math.pow() method is used calculate values raised to a power
		       
		      double monthlyPayment = (loanAmount*monthlyRate) / (1-Math.pow(1+monthlyRate, -termInMonths));
		       
		      return monthlyPayment;
		   }
	
	public static void main(String[] args) {
	    DecimalFormat ft = new DecimalFormat("#.##"); 

		Scanner input = new Scanner(System. in);
		System.out.print("Loan Amount: ");
		int loan = input. nextInt();
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double rate = input.nextDouble()/100.0;
		System.out.println();
		double monthlyPayment = calculateMonthlyPayment(loan, years, rate);
		System.out.println("Monthly Payment: "+ ft.format(monthlyPayment));
		double totalPayment = monthlyPayment*(years*12);
		System.out.println("Total Payment: " + ft.format(totalPayment)+"\n");

		double balance = loan;
		double principal=0;

		System.out.println("Payment#"+"\t"+"Interest"+"\t"+"Principal"+"\t"+"Balance");
		for(int i=1; i<=years*12; i++) {
			double interest = (rate/12) * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;

			System.out.println(i+"\t\t"+ft.format(interest)+"\t\t"+ft.format(principal)+"\t\t"+ft.format(balance));
		}


	}

}
