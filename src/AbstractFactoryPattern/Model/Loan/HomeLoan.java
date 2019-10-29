package AbstractFactoryPattern.Model.Loan;

import AbstractFactoryPattern.Model.Loan.Abstract.Loan;

public class HomeLoan extends Loan{  
    public void getInterestRate(double r){  
        rate=r;  
   }  
}//End of the HomeLoan class.  
