package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Abstract.AbstractFactory;
import AbstractFactoryPattern.Model.Bank.Interface.Bank;
import AbstractFactoryPattern.Model.Loan.BussinessLoan;
import AbstractFactoryPattern.Model.Loan.EducationLoan;
import AbstractFactoryPattern.Model.Loan.HomeLoan;
import AbstractFactoryPattern.Model.Loan.Abstract.Loan;

public class LoanFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		return null;
	}

	public Loan getLoan(String loan) {
		if (loan == null) {
			return null;
		}
		if (loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("Business")) {
			return new BussinessLoan();
		} else if (loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}
		return null;
	}

}
