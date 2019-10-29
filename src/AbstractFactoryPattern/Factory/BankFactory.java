package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Abstract.AbstractFactory;
import AbstractFactoryPattern.Model.Bank.HDFC;
import AbstractFactoryPattern.Model.Bank.ICICI;
import AbstractFactoryPattern.Model.Bank.SBI;
import AbstractFactoryPattern.Model.Bank.Interface.Bank;
import AbstractFactoryPattern.Model.Loan.Abstract.Loan;

public class BankFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		} else if (bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		return null;
	}

	public Loan getLoan(String loan) {
		return null;
	}
}// End of the BankFactory class.
