package AbstractFactoryPattern.Model.Bank;

import AbstractFactoryPattern.Model.Bank.Interface.Bank;

public class ICICI implements Bank{  
    private final String BNAME;  
    public ICICI(){  
             BNAME="ICICI BANK";  
     }  
     public String getBankName() {  
               return BNAME;  
    }  
}  
