package AbstractFactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import AbstractFactoryPattern.Abstract.AbstractFactory;
import AbstractFactoryPattern.Factory.FactoryCreator;
import AbstractFactoryPattern.Model.Bank.Interface.Bank;
import AbstractFactoryPattern.Model.Loan.Abstract.Loan;

/*

Advantage of Abstract Factory Pattern
Abstract Factory Pattern isolates the client code from concrete (implementation) classes.
It eases the exchanging of object families.
It promotes consistency among objects.

Usage of Abstract Factory Pattern
When the system needs to be independent of how its object are created, composed, and represented.
When the family of related objects has to be used together, then this constraint needs to be enforced.
When you want to provide a library of objects that does not show implementations and only reveals interfaces.
When the system needs to be configured with one of a multiple family of objects.

*/

public class AbstractFactoryPatternExample {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the name of Bank from where you want to take loan amount: ");
		String bankName = br.readLine();

		System.out.print("\n");
		System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

		String loanName = br.readLine();
		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);

		System.out.print("\n");
		System.out.print("Enter the interest rate for " + b.getBankName() + ": ");

		double rate = Double.parseDouble(br.readLine());
		System.out.print("\n");
		System.out.print("Enter the loan amount you want to take: ");

		double loanAmount = Double.parseDouble(br.readLine());
		System.out.print("\n");
		System.out.print("Enter the number of years to pay your entire loan amount: ");
		int years = Integer.parseInt(br.readLine());

		System.out.print("\n");
		System.out.println("you are taking the loan from " + b.getBankName());

		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);
	}
}// End of the AbstractFactoryPatternExample
