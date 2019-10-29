package AbstractFactoryPattern.Abstract;

import AbstractFactoryPattern.Model.Bank.Interface.Bank;
import AbstractFactoryPattern.Model.Loan.Abstract.Loan;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
}